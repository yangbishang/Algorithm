// 动态规划
// 时间复杂度: O(n^2)
// 空间复杂度: O(n)
public class _03_Integer_Break_Ⅲ {
    public int integerBreak(int n) {

        if(n < 1)
            throw new IllegalArgumentException("n should be greater than zero");

        int[] memo = new int[n+1];
        memo[1] = 1;
        for(int i = 2 ; i <= n ; i ++){
            // 求解memo[i]，对memo[i]进行分割，即每次分割成 j + (i-j)——j*（i-j)和j*memo[i-j],因为i-j一定小于i，所以memo[i-j]肯定已经被计算出来了
            for(int j = 1 ; j <= i - 1 ; j ++)
                memo[i] = max3(memo[i], j * (i - j), j * memo[i - j]);
        }


        return memo[n];
    }

    private int max3(int a, int b, int c){
        return Math.max(a, Math.max(b, c));
    }
}
