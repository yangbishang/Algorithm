import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
  给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。

 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.

 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 */
public class Solution_16 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int sum = 0;
        int offset =0;
        int closet = Integer.MAX_VALUE;
        int absOffset;

        for(int i=1; i<nums.length-1; i++){
            int l = 0;
            int r = nums.length-1;

            while(l<i && r>i){

                offset =  (nums[l]+nums[r]+nums[i]) - target;
                absOffset = Math.abs(offset);
                if(absOffset<closet){
                    sum = nums[l]+nums[r]+nums[i];
                    closet = absOffset;
                }
                if(offset > 0) r--;
                if(offset < 0) l++;
                if(offset == 0){
                    sum = nums[l]+nums[r]+nums[i];
                    break;
                }
            }

        }
        return sum;

    }

    public static void main(String[] args) {

        int [] nums = {-1,2,1,-4};
        System.out.println(threeSumClosest(nums,1));
    }

}

/*
将其重新排列，利用 left,right指针在中数为i,(起始left=0;right=nums.length -1; 1<= i <= nums.length -1;)中进行移动操作
           sum = nums[left] + nums[right] + nums[i]; 如果sum - target大于0，right--； 反之则left++；
 */