import java.util.Scanner;

/*
    双节棍字符串
    时间限制：C/C++语言 1000MS；其他语言 3000MS
    内存限制：C/C++语言 65536KB；其他语言 589824KB
    题目描述：
    对称主义者小A定义了一种“双节棍字符串”：形式如同aa…bb…cc…,其中字符a的个数等于字符c的个数，字符b的个数小于他们的个数。
    例如aaabccc,AACMM。给你一个字符串，输出该字符串的最长双节棍子串，若没有则输出NULL,若有多个则输出最靠前的一个。输入字符串的最长有1000000个字符。

    输入
    aabcccdeeea

    输出
    cccdeee


    样例输入
    AAABCCCDEEE
    样例输出
    AAABCCC
 */
public class Main9 {

    //字符频率
    static int[] freq = new int[256];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int n = str.length();
        if(n<=5)
            System.out.println("NULL");

        String ret = "";
/*        for(int i = 5 ; i < str.length() ; i ++){
            String temp = findAnswer(str , 5);
            if(ret.length() < temp.length())
                ret = temp;
        }*/

        System.out.println(ret);

    }
/*
    private static String findAnswer(String str , int index){
        for(int i=0; i<str.length(); i++){
            freq[str.charAt(i)-'a']++;
        }
    }*/
}
