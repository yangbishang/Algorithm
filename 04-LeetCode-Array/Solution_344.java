/**
     编写一个函数，其作用是将输入的字符串反转过来。

     示例 1:

     输入: "hello"
     输出: "olleh"
     示例 2:

     输入: "A man, a plan, a canal: Panama"
     输出: "amanaP :lanac a ,nalp a ,nam A"
 */

public class Solution_344 {
    public static String reverseString(String s) {

        //解法1： 暴力解法
        StringBuffer str = new StringBuffer();
        for(int i=s.length()-1; i>= 0; i--){
            str.append(s.charAt(i));
        }
        return str.toString();




    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(reverseString(s));
    }

}
