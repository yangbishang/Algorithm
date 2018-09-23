import java.util.Arrays;
import java.util.Scanner;

/**
 * 百词斩
 * 有n个整数，从其中选出一些数（至少一个），判断他们的和是否为k
 */
public class Main8 {

    private static int n ;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        int k = input.nextInt();
        System.out.println(dfs(arr , 0 , k));


    }

    public static boolean dfs(int[] arr, int index , int sum){

        if(sum == 0){
            return true;
        }

        if(index >= n)
            return false;

        return dfs(arr, index+1 , sum) || dfs(arr , index+1 , sum-arr[index]);
    }


}
