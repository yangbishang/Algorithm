/*
     给定一个只包含正整数的非空数组。是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。

     注意:
     每个数组中的元素不会超过 100
     数组的大小不会超过 200

     示例 1:
     输入: [1, 5, 11, 5]
     输出: true
     解释: 数组可以分割成 [1, 5, 5] 和 [11].


     示例 2:
     输入: [1, 2, 3, 5]
     输出: false
     解释: 数组不能分割成两个元素和相等的子集.
 */
// 记忆化搜索
// 时间复杂度: O(len(nums) * O(sum(nums)))
// 空间复杂度: O(len(nums) * O(sum(nums)))
public class _06_Partition_Equal_Subset_Sum {
    public boolean canPartition(int[] nums) {

        int sum = 0;
        for(int i = 0 ; i < nums.length ; i ++){
            if(nums[i] <= 0)
                throw new IllegalArgumentException("numbers in nums must be greater than zero.");
            sum += nums[i];
        }

        if(sum % 2 == 1)
            return false;

        return tryPartition(nums, nums.length - 1, sum / 2);
    }

    // 使用nums[0...index], 是否可以完全填充一个容量为sum的背包
    private boolean tryPartition(int[] nums, int index, int sum){

        //递归终止
        if(sum == 0)
            return true;
        if(sum < 0 || index < 0)
            return false;

        //F(i,c) = F(i-1,c) || F(i-1 , c-w(i))
        return tryPartition(nums, index - 1, sum) ||  tryPartition(nums, index - 1, sum - nums[index]);

    }
}
