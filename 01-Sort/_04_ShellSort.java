//已知的最好步长序列由Marcin Ciura设计（1，4，10，23，57，132，301，701，1750，…）
// 这项研究也表明“比较在希尔排序中是最主要的操作，而不是交换。”
// 用这样步长序列的希尔排序比插入排序和堆排序都要快，甚至在小数组中比快速排序还快，但是在涉及大量数据时希尔排序还是比快速排序慢。
public class _04_ShellSort {
    public _04_ShellSort(){ }

    public static void shellSort(Comparable[] arr){
        int n = arr.length;

        // 计算increment sequence：1, 4, 13, 40, 121, 364, 1093...
        int h = 1;
        while(h < n/3){
            h = 3*h + 1;
        }

        while (h >= 1){
            for(int i = h ; i < n ; i++){
                Comparable e = arr[i];
                int j = i;



            }
        }
    }
}
