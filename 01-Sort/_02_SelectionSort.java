//O(n2)
//选择排序
public class _02_SelectionSort {
    // 我们的算法类不允许产生任何实例
    private _02_SelectionSort(){}

    public static void sort(Comparable[] arr){

        int n = arr.length;
        for( int i = 0 ; i < n ; i ++ ){
            int minIndex = i;                                     // 寻找[i, n)区间里的最小值的索引
            for( int j = i + 1 ; j < n ; j ++ )
                if( arr[j].compareTo( arr[minIndex] ) < 0 )       // 使用compareTo方法比较两个Comparable对象的大小
                    minIndex = j;
            swap( arr , i , minIndex);
        }
    }

    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }


}