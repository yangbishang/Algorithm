/*
    给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组。如果不存在符合条件的连续子数组，返回 0。

    示例:

    输入: s = 7, nums = [2,3,1,2,4,3]
    输出: 2
    解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。
    进阶:

    如果你已经完成了O(n) 时间复杂度的解法, 请尝试 O(n log n) 时间复杂度的解法。
 */
// 滑动窗口的思路
// 时间复杂度: O(n)
// 空间复杂度: O(1)
public class _05_Minimum_Size_Subarray_Sum {
    public static int minSubArrayLen(int s, int[] nums) {
        if(s <= 0 || nums == null)
            throw new IllegalArgumentException("Illigal Arguments");

        int l = 0 , r = -1; // nums[l...r]为我们的滑动窗口
        int sum = 0;
        int res = nums.length + 1;

        while(l < nums.length){   // 窗口的左边界在数组范围内,则循环继续

            if(r + 1 < nums.length && sum < s)
                sum += nums[++r];
            else      // r已经到头 ||  sum >= s
                sum -= nums[l++];

            if(sum >= s)
                res = Math.min(res, r - l + 1);

        }

        if(res == nums.length + 1)
            return 0;
        return res;
    }
}
