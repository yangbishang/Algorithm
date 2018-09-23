import java.util.Scanner;
/*
    途家笔试
    求最大公约数和最小公倍数
    时间限制：C/C++语言 1000MS；其他语言 3000MS
    内存限制：C/C++语言 65536KB；其他语言 589824KB
    题目描述：
     输入任意两个正整数 m,n，求其最大公约数和最小公倍数。

    输入
    输入两个正整数 m 和 n

    输出
    求其最大公约数和最小公倍数


    样例输入
    15
    9
    样例输出
    3
    45
 */
public class Main5 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        if (m < n) {
            int temp = n;
            n = m;
            m = temp;
        }
        System.out.println(findMaxPublicNum(m, n));
        System.out.println(m * n / findMaxPublicNum(m, n));
    }

    public static int findMaxPublicNum(int m, int n) {
        int temp;
        if (m % n == 0)
            return n;

        return findMaxPublicNum(n, m % n);

    }
}
