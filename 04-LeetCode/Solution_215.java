/**
 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。

 示例 1:

 输入: [3,2,1,5,6,4] 和 k = 2
 输出: 5
 示例 2:

 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 输出: 4
 说明:

 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。
 */
public class Solution_215 {
    public static int findKthLargest(int[] nums, int k) {
        //思路1 暴力解法：先排序，再查找

        //思路2 选择排序
        for(int i=0 ; i<k ; i++){
            int max = i;
            for(int j=i+1; j<nums.length ; j++){
                if(nums[j] > nums[max])
                    max = j;
            }
            swap(nums,i,max);
        }
        return nums[k-1];

    }


    public static void swap(int[] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,3,1,2,4,5,5,6};

        System.out.println(findKthLargest(nums,4));
    }
}
