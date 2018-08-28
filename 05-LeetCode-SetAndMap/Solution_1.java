import java.util.HashMap;
import java.util.Map;

/**
 *
 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。

 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。

 示例:

 给定 nums = [2, 7, 11, 15], target = 9

 因为 nums[0] + nums[1] = 2 + 7 = 9
 所以返回 [0, 1]
 */

public class Solution_1 {
    public int[] twoSum(int[] nums, int target) {
/*      暴力解法
        int ret[] = new int[2];
        for(int i=0; i<nums.length-1; i++){
            for(int j =i+1; j<nums.length ; j++){
                if(nums[i]+nums[j] == target){
                    ret[0] = i;
                    ret[1] = j;
                }
            }
        }

        return ret;
*/
/*
       int[] ret = new int[2];

        Map<Integer ,Integer> map = new HashMap();
        for(int i = 0 ; i<nums.length ; i++){
            map.put(nums[i],i);
        }

        for(int i=0; i<nums.length ;i++){
            int complement = target-nums[i];
            if(map.containsKey(complement) && map.get(complement)!=i){
                ret[0] = i;
                ret[1] = map.get(complement);
                break;
            }
        }
        return ret;

*/
        int[] ret = new int[2];
        int complement = -1;

        Map<Integer ,Integer> map = new HashMap();
        for(int i = 0 ; i<nums.length ; i++){
            complement = target-nums[i];
            if(map.containsKey(complement) ){
                ret[0] = i;
                ret[1] = map.get(complement);
                break;
            }
            map.put(nums[i] , i);
        }

        return ret;
    }
}
