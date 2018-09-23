import java.util.Arrays;

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。

 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。

 示例 1:

 输入: [1,2,3,1]
 输出: 4
 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 偷窃到的最高金额 = 1 + 3 = 4 。
 示例 2:

 输入: [2,7,9,3,1]
 输出: 12
 解释: 偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 */

//自己写的，还是没有刘老师思路好
public class Solution_198 {

    public int rob(int[] nums) {
        if(nums == null)
            throw new IllegalArgumentException("error");
        if(nums.length == 0)
            return 0;

        int[] memo = new int[nums.length];
        Arrays.fill(memo , -1);
        int res = -1;
        for(int i=0; i<nums.length ; i++){
            res = Math.max(res , count(nums,memo,i));
        }

        return res;


    }

    public int count(int[] nums , int[] memo ,int index){
        if(index == nums.length-1)
            memo[nums.length-1] = nums[nums.length-1];
        if(index == nums.length-2)
            memo[nums.length-2] = nums[nums.length-2];

        if(memo[index] != -1)
            return memo[index];

        int res = -1;
        for(int i=index+2; i<nums.length; i++){
            memo[index] = Math.max(memo[index] , nums[index] + count(nums,memo,i));
        }
        return memo[index];
    }
}
