/**
     给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。

     说明：本题中，我们将空字符串定义为有效的回文串。

     示例 1:

     输入: "A man, a plan, a canal: Panama"
     输出: true
     示例 2:

     输入: "race a car"
     输出: false
 */


public class Solution_125 {

    public static boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        int l = 0;
        int r = str.length()-1;
        boolean ret = true;
        OUT:
        while(l<= r){
            if(str.charAt(l)<48||(str.charAt(l)< 97 && str.charAt(l)>57) || str.charAt(l)>122){
                l++;
                continue;
            }
            if (str.charAt(r)<48 ||(str.charAt(r)< 97 && str.charAt(r)>57)  || str.charAt(r)>122) {
                r--;
                continue;
            }


            if(str.charAt(l) != str.charAt(r)){
                ret = false;
                break;
            }else{
                l++;
                r--;
            }
        }
        return ret;
    }


    public static void  main(String[] args){
        String str = "A 1man, a plan, a canal: Panam1a";

        System.out.println(isPalindrome(str));
    }
}
