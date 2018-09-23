/**
 给定一个 32 位有符号整数，将整数中的数字进行反转。

 示例 1:

 输入: 123
 输出: 321
 示例 2:

 输入: -123
 输出: -321
 示例 3:

 输入: 120
 输出: 21
 注意:

 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
 */
public class Solution_7 {
    public int reverse(int x) {

        boolean negative = false;
        if(x<0){
            x = Math.abs(x);
            negative = true;

        }

        long retNum = 0;
        while(x>0){
            retNum *= 10;
            retNum += x%10;
            x = x/10;
        }

        if(retNum>Integer.MAX_VALUE)
            return 0;

        return negative ? -(int)retNum : (int)retNum;
    }
}
