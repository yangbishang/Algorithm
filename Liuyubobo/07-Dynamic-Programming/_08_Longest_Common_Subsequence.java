import java.util.Arrays;

/*
    给出两个字符串S1和S2，求这两个字符串的最长公共子序列的长度 //这题对不对不确定！
 */
// LCS问题
// 动态规划
// 时间复杂度: O(len(s1)*len(s2))
// 空间复杂度: O(len(s1)*len(s2))
public class _08_Longest_Common_Subsequence {
    private int[][] memo;

    public int lcs(String s1, String s2){

        if(s1 == null || s2 == null)
            throw new IllegalArgumentException("s1 and s2 can not be null.");

        if(s1.length() == 0 || s2.length() == 0)
            return -1;

        memo = new int[s1.length()][s2.length()];
        for(int i = 0 ; i < s1.length() ; i ++)
            Arrays.fill(memo[i], -1);

        int ret = lcs(s1, s2, s1.length() - 1, s2.length() - 1);
        return ret;
    }

    // 求s1[0...m]和s2[0...n]的最长公共子序列的长度值
    private int lcs(String s1, String s2, int m, int n){

        if(m < 0 || n < 0)
            return 0;

        if(memo[m][n] != -1)
            return memo[m][n];

        int res = 0;
        if(s1.charAt(m) == s2.charAt(n))
            res = 1 + lcs(s1, s2, m - 1, n - 1);
        else
            res = Math.max(lcs(s1, s2, m - 1, n),
                    lcs(s1, s2, m, n - 1));

        memo[m][n] = res;
        return res;
    }










    public static void main(String[] args) {

        String s1 = "ABCDGH";
        String s2 = "AEDFHR";
        System.out.println((new _08_Longest_Common_Subsequence()).lcs(s1, s2));

        s1 = "AAACCGTGAGTTATTCGTTCTAGAA";
        s2 = "CACCCCTAAGGTACCTTTGGTTC";
        System.out.println((new _08_Longest_Common_Subsequence()).lcs(s1, s2));
    }
}
