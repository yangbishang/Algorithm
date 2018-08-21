/**

 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。

 说明：你不能倾斜容器，且 n 的值至少为 2。



 图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。

 图略

 示例:

 输入: [1,8,6,2,5,4,8,3,7]
 输出: 49
 */
public class Solution_11 {
    public static int maxArea(int[] height) {
/*
        //暴力解法
        int max = 0;
        int temp;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                temp = Math.min(height[i], height[j]) * (j - i);
                if (temp > max)
                    max = temp;
            }
        }

        return max;
*/
        int max = 0;
        int temp = 0 ;
        int l = 0;
        int r = height.length-1;
        while(l<r){
            temp = Math.min(height[l], height[r]) * (r - l);
            if(temp > max)
                max = temp;

            if(height[r]>height[l]){
                l++;
            }else{
                r--;
            }
        }

        return max;

    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));

    }

}