import javax.smartcardio.CommandAPDU;
import java.util.Arrays;
import java.util.Map;

public class Test {

    private static void quick(Comparable[] arr, int l,int r){
        swap (arr , l ,(int)(Math.random()*(r-l+1)) + l);
        Comparable e = arr[l];
        int lt = l;
        int gt = r+1;
        int i = l+1;
        while(i<gt){
            if(arr[i].compareTo(e)<0){
                swap(arr,lt+1,i);
                lt++;
                i++;
            }else if(arr[i].compareTo(e)>0){
                swap(arr,gt-1,i);
                gt--;
                i++;
            }else{
                i++;
            }
        }
        swap(arr,l,lt);
        quick(arr,l,lt-1);
        quick(arr,gt,r);

    }


    public static void quick(Comparable[] arr){
        int n = arr.length;
        quick(arr,0,n-1);
    }




    public static void swap(Comparable[] arr,int i , int j){
        Comparable e = arr[i];
        arr[i] = arr[j];
        arr[j] = e;
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{4,12,123,4,123,55,34,122,31,1};
        quick(arr);
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
