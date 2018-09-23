public class Solution_70_optimized {
    private int[] memo;
    public int climbStairs(int n) {
        memo = new int[n+2];  //必须是n+2，因为假设n=1的时候，memo[2] = 2就会报ArrayIndexOutOfBoundsException
        memo[1] = 1;
        memo[2] = 2;
        for(int i=3; i<=n; i++){
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[n];
    }

    public static void main(String[] args) {

        System.out.println((new Solution_70_optimized()).climbStairs(10));
    }
}
