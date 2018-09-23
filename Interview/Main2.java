import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int W = scanner.nextInt();

        //一共有多少种排列
        int total = (int) Math.pow(W , N);
        //不坏账
        int goodNum = (int) (N * Math.pow(W-1,N-1));

        System.out.println((total-goodNum));
    }

}
