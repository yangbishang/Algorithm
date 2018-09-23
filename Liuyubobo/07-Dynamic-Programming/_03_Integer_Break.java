/*
     给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。

     示例 1:
     输入: 2
     输出: 1
     解释: 2 = 1 + 1, 1 × 1 = 1。

     示例 2:
     输入: 10
     输出: 36
     解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36。
     说明: 你可以假设 n 不小于 2 且不大于 58。
 */

// 暴力搜索,在Leetcode中提交这个版本的代码会超时! (Time Limit Exceeded)
// 时间复杂度: O(n^n)
// 空间复杂度: O(n)
public class _03_Integer_Break {
    public int integerBreak(int n) {

        if(n < 1)
            throw new IllegalArgumentException("n should be greater than zero");

        return breakInteger(n);
    }

    // 将n进行分割(至少分割两部分), 可以获得的最大乘积
    private int breakInteger(int n){

        if(n == 1)
            return 1;

        int res = -1;
        for(int i = 1 ; i <= n - 1 ; i ++)
            // F(i) = Max( i*(n-1) , i*F(n-i))
            res = max3(res, i * (n - i), i * breakInteger(n - i));
        return res;
    }

    private int max3(int a, int b, int c){
        return Math.max(a, Math.max(b, c));
    }
}
