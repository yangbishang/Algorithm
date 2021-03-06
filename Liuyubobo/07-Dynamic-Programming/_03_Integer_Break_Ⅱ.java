import java.util.Arrays;
// 记忆化搜索
// 时间复杂度: O(n^2)
// 空间复杂度: O(n)
public class _03_Integer_Break_Ⅱ {

    private int[] memo;

    public int integerBreak(int n) {

        if(n < 1)
            throw new IllegalArgumentException("n should be greater than zero");

        memo = new int[n+1];
        Arrays.fill(memo, -1);

        return breakInteger(n);
    }

    // 将n进行分割(至少分割两部分), 可以获得的最大乘积
    private int breakInteger(int n){

        if(n == 1)
            return 1;

        if(memo[n] != -1)
            return memo[n];

        int res = -1;
        for(int i = 1 ; i <= n - 1 ; i ++){
            // F(i) = Max( i*(n-1) , i*F(n-i))
            res = max3(res, i * (n - i) , i * breakInteger(n - i));
        }

        memo[n] = res;
        return res;
    }

    private int max3(int a, int b, int c){
        return Math.max(a, Math.max(b, c));
    }
}
