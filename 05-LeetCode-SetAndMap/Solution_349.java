import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 给定两个数组，编写一个函数来计算它们的交集。

 示例 1:

 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 输出: [2]
 示例 2:

 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 输出: [9,4]
 说明:

 输出结果中的每个元素一定是唯一的。
 我们可以不考虑输出结果的顺序。
 */
public class Solution_349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet();
        Set<Integer> set2 = new HashSet();

        for(int i=0 ; i<nums1.length ; i++){
            set1.add(nums1[i]);
        }

        for(int j=0 ; j<nums2.length ; j++){
            if(set1.contains(nums2[j]))
                set2.add(nums2[j]);
        }

        int[] ret = new int[set2.size()];
        int index = 0;
        for(Integer s : set2){
            ret[index++] = s;
        }

        return ret;
    }


    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] res = (new Solution_349()).intersection(nums1, nums2);
        for(int s :res)
            System.out.println(s);
    }
}
