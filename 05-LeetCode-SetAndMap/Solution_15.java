/**
 *
 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。

 注意：答案中不可以包含重复的三元组。

 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，

 满足要求的三元组集合为：
 [
 [-1, 0, 1],
 [-1, -1, 2]
 ]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_15 {
    public static List<List<Integer>> threeSum(int[] nums) {


        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                break;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int j = nums.length - 1;
            int target = 0 - nums[i];
            int k = i + 1;
            while (k < j) {
                if (nums[k] + nums[j] == target) {
                    List<Integer> item = Arrays.asList(nums[i], nums[k], nums[j]);
                    result.add(item);
                    while (k < j && nums[k] == nums[k + 1])
                        k++;
                    while (k < j && nums[j] == nums[j - 1])
                        j--;
                    k++;j--;
                } else if (nums[k] + nums[j] < target) {
                    k++;
                } else {
                    j--;
                }
            }
        }
        return result;


    }


    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List list = threeSum(nums);
        System.out.println(list);
    }
}


/**
 * 解答：
 一开始想的非常简单，三个遍历，满足条件的放入一个List，然后再将这个List与已有的满足条件的List进行比较，看看有没有元素相同的，有的话不加入。

 显然这样会超时, 因为三个循环太费时，时间复杂度，再加上比较当前满足条件的集合，更加费时。

 我们可以先将原数组从小到大排序，固定其中两个元素 i 和 j，i从前往后走，j从后往前走，i 每往后一个，将 j 重置为数组末尾的下标，在 i 和 j 之间找使nums[i] + nums[j] + nums[k] == 0成立的k。

 那么如何去重呢？
 每次得出nums[i] + nums[j] + nums[k] == 0成立的i、j、k之后，令 i 往后走，直到nums[i] != nums[i + 1],并令 j 向前走，直到nums[j] != nums[j - 1]。这样就能保证得到的三个数字不会有重复。下面是代码
 */
