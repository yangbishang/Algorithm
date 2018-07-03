public class HeapSort_01 {
    // 我们的算法类不允许产生任何实例
    private HeapSort_01(){}

    // 对整个arr数组使用HeapSort2排序
    // HeapSort2, 借助我们的heapify过程创建堆
    // 此时, 创建堆的过程时间复杂度为O(n), 将所有元素依次从堆中取出来, 实践复杂度为O(nlogn)
    // 堆排序的总体时间复杂度依然是O(nlogn), 但是比HeapSort1性能更优, 因为创建堆的性能更优
    public static void sort(Comparable[] arr){

        int n = arr.length;
        //构造一个堆
        MaxHeap<Comparable> maxHeap = new MaxHeap<Comparable>(arr);
        //排序
        for( int i = n-1 ; i >= 0 ; i -- )
            arr[i] = maxHeap.extractMax();
    }

}
