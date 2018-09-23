import java.util.Arrays;
// 对于动态规划
// 自底向上
public class _01_Fibonacci_Ⅲ {
    public int fib(int n){

        int[] memo = new int[n + 1];     // 重叠子问题
        Arrays.fill(memo, -1);

        memo[0] = 0;
        memo[1] = 1;
        for(int i = 2 ; i <= n ; i ++)
            memo[i] = memo[i - 1] + memo[i - 2];

        return memo[n];
    }
}
