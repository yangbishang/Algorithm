//O(n2)
//相比于选择排序，插入排序的一个优点是提前终止，不用遍历整个数组，因此，插入排序应该要比选择排序的效率更加的高效，
//数组与接近有序，插入排序越快，当数组完全有序时，插入排序为O(n)级别的排序
public class _03_InsertionSort {

    // 我们的算法类不允许产生任何实例
    private _03_InsertionSort(){}

    public static void sort(Comparable[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {

            // 写法1
//            for( int j = i ; j > 0 ; j -- ){
//                if( arr[j].compareTo( arr[j-1] ) < 0 )
//                    swap( arr, j , j-1 );
//                else
//                    break;
//            }


            // 写法2
//            for( int j = i; j > 0 && arr[j].compareTo(arr[j-1]) < 0 ; j--){
//                swap(arr, j, j-1);
//            }


            // 写法3----速度更快，因为方法一二交换一次要赋值三次,而本方法只要赋值一次
            Comparable e = arr[i];
            int j = i;
            for( ; j > 0 && arr[j-1].compareTo(e) > 0 ; j--)
                arr[j] = arr[j-1];
            arr[j] = e;

        }
    }

    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }






    //后面高级排序引用这个方法
    // 对arr[l...r]的区间使用InsertionSort排序
    public static void sort(Comparable[] arr, int l, int r){

        for( int i = l + 1 ; i <= r ; i ++ ){
            Comparable e = arr[i];
            int j = i;
            for( ; j > l && arr[j-1].compareTo(e) > 0 ; j--)
                arr[j] = arr[j-1];
            arr[j] = e;
        }
    }


















}
