import java.util.Arrays;

//刘老师的版本，和我的Solution_198大同小异
public class Solution_198_01 {
    // memo[i] 表示考虑抢劫 nums[i...n-1] 所能获得的最大收益
    private int[] memo;

    public int rob(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return tryRob(nums, 0);
    }

    // 考虑抢劫nums[index...nums.size())这个范围的所有房子
    private int tryRob(int[] nums, int index){

        if(index >= nums.length)
            return 0;

        if(memo[index] != -1)
            return memo[index];

        int res = 0;
        for(int i = index ; i < nums.length ; i ++)
            res = Math.max(res, nums[i] + tryRob(nums, i + 2));
        memo[index] = res;
        return res;
    }

    public static void main(String[] args) {

        int nums[] = {2, 1};
        System.out.println((new Solution_198_01()).rob(nums));
    }
}
