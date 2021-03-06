/**

     给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。

     函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。

     说明:

     返回的下标值（index1 和 index2）不是从零开始的。
     你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
     示例:

     输入: numbers = [2, 7, 11, 15], target = 9
     输出: [1,2]
     解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 */
public class Solution_167 {
    public static int[] twoSum(int[] numbers, int target) {
/*
        int[] ret = new int[2];

        OUT:
        for(int i = 0 ; i< numbers.length-1 ; i++){
            for(int j = i+1 ; j<numbers.length; j++){
                if((numbers[i] + numbers[j]) == target){
                    ret[0] = i+1;
                    ret[1] = j+1;
                    break OUT;
                }
            }
        }
        return  ret;
*/

        int l=0;
        int r=numbers.length - 1;
        int[] ret = new int[2];
        while(l<r){
            if((numbers[l]+numbers[r]) < target){
                l ++;
            }
            if(numbers[l]+numbers[r] >target ){
                r--;
            }
            if(numbers[l]+numbers[r] == target){
                ret[0] = l+1;
                ret[1] = r+1;
                break;
            }

        }
        return  ret;
    }


    public static void main(String[] args) {
        int[] nums1 = new int[]{2, 7, 11, 15};
        int[] ret = twoSum(nums1 , 9);
        System.out.println(ret[0]+","+ret[1]);
    }
}
