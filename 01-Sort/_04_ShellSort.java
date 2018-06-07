//已知的最好步长序列由Marcin Ciura设计（1，4，10，23，57，132，301，701，1750，…）
// 这项研究也表明“比较在希尔排序中是最主要的操作，而不是交换。”
// 用这样步长序列的希尔排序比插入排序和堆排序都要快，甚至在小数组中比快速排序还快，但是在涉及大量数据时希尔排序还是比快速排序慢。
public class _04_ShellSort {

    // 我们的算法类不允许产生任何实例
    private _04_ShellSort(){}

    public static void sort(Comparable[] arr){

        int n = arr.length;
        // [11,10,9,8,7,6,5,4,3,2,1]
        // 计算 increment sequence: 1, 4, 13, 40, 121, 364, 1093...
        int h = 1;
        while (h < n/3) h = 3*h + 1;

        while (h >= 1) {

            // h-sort the array
            for (int i = h; i < n; i++) {

                // 对 arr[i], arr[i-h], arr[i-2*h], arr[i-3*h]... 使用插入排序
                Comparable e = arr[i];
                int j = i;
                for ( ; j >= h && e.compareTo(arr[j-h]) < 0 ; j -= h)
                    arr[j] = arr[j-h];
                arr[j] = e;
            }

            h /= 3;
        }
    }
}
