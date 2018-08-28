import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
有效的字母异位词
    给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。

    示例 1:

    输入: s = "anagram", t = "nagaram"
    输出: true
    示例 2:

    输入: s = "rat", t = "car"
    输出: false
    说明:
    你可以假设字符串只包含小写字母。

    进阶:
    如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 */
public class Solution_242 {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;

        Map<Character , Integer> map1 = new HashMap<>();

        for(int i=0 ; i<s.length() ;i++){
            if(map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i), map1.get(s.charAt(i))+1);
            }else{
                map1.put(s.charAt(i), 1);
            }
        }

        for(int i= 0 ; i<t.length(); i++){
            Character key = t.charAt(i);
            if(map1.containsKey(key)){
                map1.put(key , map1.get(key)-1);
                if(map1.get(key)==0)
                    map1.remove(key);
            }
        }

        if(map1.isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(new Solution_242().isAnagram(s,t));
    }
}
