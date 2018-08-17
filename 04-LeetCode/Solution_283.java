/**
     给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

     示例:

     输入: [0,1,0,3,12]
     输出: [1,3,12,0,0]
     说明:

     必须在原数组上操作，不能拷贝额外的数组。
     尽量减少操作次数。
 */

public class Solution_283 {
    public static void moveZeroes(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                int zero = nums[i];
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j] != zero){
                        nums[i] = nums[j];
                        nums[j] = zero;
                        break;
                    }
                }
            }
        }

/*
        int k = 0; // nums中, [0...k)的元素均为非0元素

        // 遍历到第i个元素后,保证[0...i]中所有非0元素都按照顺序排列在[0...k)中
        for(int i = 0 ; i < nums.length ; i ++)
            if( nums[i] != 0 )
                nums[k++] = nums[i];

        // 将nums剩余的位置放置为0
        for(int i = k ; i < nums.length ; i ++)
            nums[i] = 0;

*/

/*
        int k = 0; // nums中, [0...k)的元素均为非0元素

        // 遍历到第i个元素后,保证[0...i]中所有非0元素都按照顺序排列在[0...k)中
        // 同时, [k...i] 为 0
        for(int i = 0 ; i < nums.length ; i ++)
            if(nums[i] != 0)
                if(k != i)
                    swap(nums, k++, i);
                else
                    k ++;
 */
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1};
        moveZeroes(nums);
        for(int i = 0; i<nums.length ; i++){
            System.out.println(nums[i]);
        }
    }
}
