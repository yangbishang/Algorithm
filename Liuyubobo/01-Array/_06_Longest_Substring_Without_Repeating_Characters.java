/**

 给定一个字符串，找出不含有重复字符的最长子串的长度。

 示例 1:
 输入: "abcabcbb"
 输出: 3
 解释: 无重复字符的最长子串是 "abc"，其长度为 3。

 示例 2:
 输入: "pwwkew"
 输出: 3
 解释: 无重复字符的最长子串是 "wke"，其长度为 3。

 请注意，答案必须是一个子串，"pwke" 是一个子序列 而不是子串。
 */

// 滑动窗口
// 时间复杂度: O(len(s))
// 空间复杂度: O(len(charset))
public class _06_Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {

        int[] freq = new int[256];

        int l = 0, r = -1; //滑动窗口为s[l...r]
        int res = 0;

        // 整个循环从 l == 0; r == -1 这个空窗口开始
        // 到l == s.size(); r == s.size()-1 这个空窗口截止
        // 在每次循环里逐渐改变窗口, 维护freq, 并记录当前窗口中是否找到了一个新的最优值
        while(l < s.length()){

            if(r + 1 < s.length() && freq[s.charAt(r+1)] == 0)
                freq[s.charAt(++r)] ++;
            else    //r已经到头 || freq[s[r+1]] == 1
                freq[s.charAt(l++)] --;

            res = Math.max(res, r-l+1);
        }

        return res;
    }
}
