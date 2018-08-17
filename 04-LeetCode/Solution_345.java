import java.util.HashSet;
import java.util.Set;

/**
     编写一个函数，以字符串作为输入，反转该字符串中的元音字母。

     示例 1:

     输入: "hello"
     输出: "holle"
     示例 2:

     输入: "leetcode"
     输出: "leotcede"
     说明:
     元音字母不包含字母"y"。
 */
public class Solution_345 {
    //a,e,i,o,u
    public static String reverseVowels(String s) {
        Set set = new HashSet();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        int l =0;
        int r = s.length()-1;
        char[] charArray = s.toCharArray();

        while(l <= r){
            if(!set.contains(charArray[l])){
                l++;
                continue;
            }
            if(!set.contains(charArray[r])){
                r--;
                continue;
            }

            char temp = charArray[l];
            charArray[l] = charArray[r];
            charArray[r] = temp;
            l++;
            r--;

        }

        return s.valueOf(charArray);
    }


    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }
}
