import java.util.Arrays;

public class _05_MergeSort_01_Optm {
    // 我们的算法类不允许产生任何实例
    private _05_MergeSort_01_Optm(){}

    // 将arr[l...mid]和arr[mid+1...r]两部分进行归并
    private static void merge(Comparable[] arr, int l, int mid, int r) {

        Comparable[] aux = Arrays.copyOfRange(arr, l, r+1);

        // 初始化，i指向左半部分的起始索引位置l；j指向右半部分起始索引位置mid+1
        int lp = l, rp = mid+1;
        for( int i = l ; i <= r; i ++ ){

            if( lp > mid ){  // 如果左半部分元素已经全部处理完毕
                arr[i] = aux[rp-l]; rp ++;
            }
            else if( rp > r ){   // 如果右半部分元素已经全部处理完毕
                arr[i] = aux[lp-l]; lp ++;
            }
            else if( aux[lp-l].compareTo(aux[rp-l]) < 0 ){  // 左半部分所指元素 < 右半部分所指元素
                arr[i] = aux[lp-l]; lp ++;
            }
            else{  // 左半部分所指元素 >= 右半部分所指元素
                arr[i] = aux[rp-l]; rp ++;
            }
        }
    }

    // 递归使用归并排序,对arr[l...r]的范围进行排序
    private static void sort(Comparable[] arr, int l, int r) {

        // 优化2: 对于小规模数组, 使用插入排序
        // 对于所有高级排序算法，都存在递归到底的情况
        // 1）数据规模较小的时候，元素近乎有序的可能性比较大
        // 2) 前面系数插入比归并小
        if( r - l <= 15 ){
            _03_InsertionSort.sort(arr, l, r);
            return;
        }

        int mid = (l+r)/2;
        sort(arr, l, mid);
        sort(arr, mid + 1, r);

        // 优化1: 对于arr[mid] <= arr[mid+1]的情况,不进行merge(因为[l-mid]和[mid+1-r]已经是有序的)
        // 对于近乎有序的数组非常有效,但是对于一般情况,有一定的性能损失(因为判断也要时间)
        if( arr[mid].compareTo(arr[mid+1]) > 0 )
            merge(arr, l, mid, r);
    }

    public static void sort(Comparable[] arr){
        int n = arr.length;
        sort(arr, 0, n-1);
    }




}
