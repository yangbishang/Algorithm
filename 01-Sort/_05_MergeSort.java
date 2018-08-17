import java.util.Arrays;
//缺点：要开辟临时空间（O（n)的额外空间），但是时间的复杂度相对于空间的复杂更重要
public class _05_MergeSort {
    // 我们的算法类不允许产生任何实例
    private _05_MergeSort(){}

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

        if (l >= r)
            return;

        int mid = (l+r)/2;         //其实要注意l+r溢出
        sort(arr, l, mid);
        sort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    public static void sort(Comparable[] arr){

        int n = arr.length;
        sort(arr, 0, n-1);
    }


}
