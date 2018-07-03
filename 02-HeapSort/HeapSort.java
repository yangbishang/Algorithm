public class HeapSort {

    //我们的算法类不允许产生任何实例
    private HeapSort(){}

    public static void sort(Comparable[] arr){

        int n = arr.length;
        MaxHeap<Comparable> maxHeap = new MaxHeap<Comparable>();

        //构造堆
        for(int i=0 ; i<n ; i++){
            maxHeap.add(arr[i]);
        }

        //排序
        for(int j=n-1 ; j>=0 ; j--){
            arr[j] = maxHeap.extractMax();
        }
    }






}
