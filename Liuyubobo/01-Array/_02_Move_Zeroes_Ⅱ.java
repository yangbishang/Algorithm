
// 原地(in place)解决该问题
// 时间复杂度: O(n)
// 空间复杂度: O(1)
public class _02_Move_Zeroes_Ⅱ {
    public void moveZeroes(int[] nums) {

        int k = 0; // nums中, [0...k)的元素均为非0元素

        // 遍历到第i个元素后,保证[0...i]中所有非0元素
        // 都按照顺序排列在[0...k)中
        for(int i = 0 ; i < nums.length ; i ++)
            if( nums[i] != 0 )
                nums[k++] = nums[i];

        // 将nums剩余的位置放置为0
        for(int i = k ; i < nums.length ; i ++)
            nums[i] = 0;
    }
}
