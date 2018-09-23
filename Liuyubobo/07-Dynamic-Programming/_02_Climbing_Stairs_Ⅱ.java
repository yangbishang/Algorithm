/// 动态规划
/// 时间复杂度: O(n)
/// 空间复杂度: O(n)
public class _02_Climbing_Stairs_Ⅱ {
    private int[] memo;
    public int climbStairs(int n) {
        memo = new int[n+2];  //必须是n+2，因为假设传入方法的n=1的时候，memo[2] = 2就会报ArrayIndexOutOfBoundsException
        memo[1] = 1;
        memo[2] = 2;
        for(int i=3; i<=n; i++){
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[n];
    }

/*
   public int climbStairs(int n) {

        int[] memo = new int[n + 1];
        memo[0] = 1;
        memo[1] = 1;
        for(int i = 2 ; i <= n ; i ++)
            memo[i] = memo[i - 1] + memo[i - 2];
        return memo[n];
    }
*/
}
