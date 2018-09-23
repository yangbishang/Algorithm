import java.util.Arrays;

/**
     给定一个无序的整数数组，找到其中最长上升子序列的长度。

     示例:

     输入: [10,9,2,5,3,7,101,18]
     输出: 4
     解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。
     说明:

     可能会有多种最长上升子序列的组合，你只需要输出对应的长度即可。
     你算法的时间复杂度应该为 O(n2) 。
     进阶: 你能将算法的时间复杂度降低到 O(n log n) 吗?
 */
public class Solution_300 {
    private int[] memo;

    public int lengthOfLIS(int[] nums) {

        if(nums.length == 0)
            return 0;

        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        int res = 1;
        for(int i = 0 ; i < nums.length ; i ++)
            res = Math.max(res, getMaxLength(nums, i));

        return res;
    }

    // 以 nums[index] 为结尾的最长上升子序列的长度
    private int getMaxLength(int[] nums, int index){

        if(memo[index] != -1)
            return memo[index];

        int res = 1;
        for(int i = 0 ; i <= index-1 ; i ++)
            if(nums[index] > nums[i])
                res = Math.max(res, 1 + getMaxLength(nums, i));

        return memo[index] = res;
    }
}
