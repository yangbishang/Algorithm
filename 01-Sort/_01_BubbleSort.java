//O(n2)
//使用优化的BubbleSort
public class _01_BubbleSort {

    // 我们的算法类不允许产生任何实例
    private _01_BubbleSort(){}

    public static void sort(Comparable[] arr){

        int n = arr.length;
        int newn; // 理论上,可以使用newn进行优化,但实际优化效果较差

        do{
            newn = 0;
            for( int i = 1 ; i < n ; i ++ )
                if( arr[i-1].compareTo(arr[i]) > 0 ){
                    swap( arr , i-1 , i );

                    // 可以记录最后一次的交换位置,在此之后的元素在下一轮扫描中均不考虑
                    newn = i;
                }
            n = newn;
        }while(newn > 0);
    }


/*    public static void sort(Comparable[] arr){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr.length-i-1; j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    swap(arr,j,j+1);
                }
            }
        }
    }*/

    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
