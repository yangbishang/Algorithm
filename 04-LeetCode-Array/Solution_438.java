import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 找到字符串中所有字母异位词
 * 给定一个字符串 s 和一个非空字符串 p，找到 s 中所有是 p 的字母异位词的子串，返回这些子串的起始索引。

 字符串只包含小写英文字母，并且字符串 s 和 p 的长度都不超过 20100。

 说明：

 字母异位词指字母相同，但排列不同的字符串。
 不考虑答案输出的顺序。
 示例 1:

 输入:
 s: "cbaebabacd" p: "abc"

 输出:
 [0, 6]

 解释:
 起始索引等于 0 的子串是 "cba", 它是 "abc" 的字母异位词。
 起始索引等于 6 的子串是 "bac", 它是 "abc" 的字母异位词。
 示例 2:

 输入:
 s: "abab" p: "ab"

 输出:
 [0, 1, 2]

 解释:
 起始索引等于 0 的子串是 "ab", 它是 "ab" 的字母异位词。
 起始索引等于 1 的子串是 "ba", 它是 "ab" 的字母异位词。
 起始索引等于 2 的子串是 "ab", 它是 "ab" 的字母异位词。给定一个字符串 s 和一个非空字符串 p，找到 s 中所有是 p 的字母异位词的子串，返回这些子串的起始索引。

 字符串只包含小写英文字母，并且字符串 s 和 p 的长度都不超过 20100。

 说明：

 字母异位词指字母相同，但排列不同的字符串。
 不考虑答案输出的顺序。
 示例 1:

 输入:
 s: "cbaebabacd" p: "abc"

 输出:
 [0, 6]

 解释:
 起始索引等于 0 的子串是 "cba", 它是 "abc" 的字母异位词。
 起始索引等于 6 的子串是 "bac", 它是 "abc" 的字母异位词。
 示例 2:

 输入:
 s: "abab" p: "ab"

 输出:
 [0, 1, 2]

 解释:
 起始索引等于 0 的子串是 "ab", 它是 "ab" 的字母异位词。
 起始索引等于 1 的子串是 "ba", 它是 "ab" 的字母异位词。
 起始索引等于 2 的子串是 "ab", 它是 "ab" 的字母异位词。
 */
public class Solution_438 {
    //没做出来！！

/*    public static List<Integer> findAnagrams(String s, String p) {
        int l = 0;
        int r = p.length()-1;
        List list = new ArrayList();
        Set set = new HashSet();

        while( l<s.length()-p.length() && r<s.length()){
            for(int j = l; j<=r ; j++){
                set.add(s.charAt(j));
            }
            int num=0;
            for(int n=0; n<p.length(); n++){
                if (set.contains(p.charAt(n))){
                    num++;
                }
            }
            System.out.println(num + "," + p.length());
            if(num == p.length())
                list.add(l);

            l++;
            r++;

        }
        return list;
    }


    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List list  =  findAnagrams(s,p);
        for(int i = 0; i<list.size() ; i++){
            System.out.println(list.get(i));
        }
    }*/

}
