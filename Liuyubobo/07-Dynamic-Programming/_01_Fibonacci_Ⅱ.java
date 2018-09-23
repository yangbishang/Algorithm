import java.util.Arrays;
// 重叠子问题
// 记忆化搜索
// 自顶向下
public class _01_Fibonacci_Ⅱ {
    private int num = 0;

    public int fib(int n){

        int[] memo = new int[n + 1];  //是n+1不是n，因为传入n的话memo实际的索引范围为[0,n-1],第n个Fibonacci就越界了
        Arrays.fill(memo, -1);

        return fib(n, memo);
    }

    private int fib(int n, int[] memo){

        num ++;

        if(n == 0)
            return 0;

        if(n == 1)
            return 1;

        if(memo[n] == -1)
            memo[n] = fib(n - 1, memo) + fib(n - 2, memo);

        return memo[n];
    }
}
