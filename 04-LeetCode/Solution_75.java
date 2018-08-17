/**

     给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。

     此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。

     注意:
     不能使用代码库中的排序函数来解决这道题。

     示例:

     输入: [2,0,2,1,1,0]
     输出: [0,0,1,1,2,2]
     进阶：

     一个直观的解决方案是使用计数排序的两趟扫描算法。
     首先，迭代计算出0、1 和 2 元素的个数，然后按照0、1、2的排序，重写当前数组。
     你能想出一个仅使用常数空间的一趟扫描算法吗？

 */

public class Solution_75 {
    public static void sortColors(int[] nums) {
/*
        int zero = 0;
        int one = 0;
        int two = 0;

        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] == 0)
                zero ++;
            if(nums[i] == 1)
                one ++;
            if(nums[i] ==2)
                two ++;
        }

        for(int i =0; i<nums.length; i++){
            if(i<zero)
                nums[i] = 0;
            if(zero-1 < i && i< one+zero)
                nums[i] = 1;
            if( i >= one+zero)
                nums[i] = 2;
        }

*/

        int l = 0;   // 0区间 [0  l)
        int r = nums.length;   // 1区间 [r  length]

        //三路快排思想
        for(int i=0 ; i<nums.length && i < r; i++){
            if(nums[i] == 0 ){
                swap(nums , l  , i);
                l++;
            }

            if(nums[i] ==2 ){
                r--;
                swap(nums , r , i);
                i--;
            }

        }
    }

    public static void swap(int[] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,0,2,1,0,1,2,0,0,1,1,1,0};
        sortColors(nums);
        for(int i = 0; i<nums.length ; i++){
            System.out.println(nums[i]);
        }
    }
}
