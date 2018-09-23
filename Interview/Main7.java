import java.util.Scanner;

/**
 * 百词斩
 * 求n是否为素数
 *
 */
public class Main7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        boolean ret = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                ret = false;
                break;
            } else {
                continue;
            }
        }
        System.out.println(ret);
    }
}
