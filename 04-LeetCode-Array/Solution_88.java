import java.util.Arrays;

/**
     给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。

     说明:

     初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
     你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
     示例:

     输入:
     nums1 = [1,2,3,0,0,0], m = 3
     nums2 = [2,5,6],       n = 3

     输出: [1,2,2,3,5,6]

 */

public class Solution_88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] aux = Arrays.copyOfRange(nums1,0,m);
        int p1 = 0;
        int p2 = 0;
        for(int i=0 ; i<m+n ; i++){
            if(p1 >= m){
                nums1[i] = nums2[p2];
                p2++;
            }else if(p2 >= n){
                nums1[i] = aux[p1];
                p1 ++;
            }else if(aux[p1] < nums2[p2]){
                nums1[i] = aux[p1];
                p1++;
            }else{
                nums1[i] = nums2[p2];
                p2++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1 , 3 ,nums2 , 3);
        for(int i = 0; i<nums1.length ; i++){
            System.out.println(nums1[i]);
        }
    }
}
