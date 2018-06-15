public class MaxHeap<E extends Comparable> {
    private E[] data;
    private int size;
    private int capacity;

    public MaxHeap(int capacity){
        this.data = (E[])new Comparable[capacity];
        size = 0;
        this.capacity = capacity;
    }
    public MaxHeap(){
        this.data = (E[])new Comparable[capacity];
        this.size = size;
        this.capacity = 10;
    }

    public boolean isEmpty(){
        return size==0;
    }


    //向堆中添加元素
    public void add(E e){
        if((size+1) > capacity)
            throw new IllegalArgumentException("the heap capacity is full!");
        data[++size] = e;
        shiftUp(size);
    }
    private void shiftUp(int k){
        while(k>0 && data[k].compareTo(data[(k-1)/2])>0){
            swap(k,(k-1)/2);
            k = (k-1)/2 ;
        }
    }

    //从堆中删除元素
    public E extractMax(){
        if(isEmpty())
            throw new IllegalArgumentException("the heap is empty!");

        E e = data[0];

        swap(0,size);
        size -- ;
        shiftDown(0);
        return e;
    }
    public void shiftDown(int k){
        while( k*2+1 < size && data[k].compareTo(data[k*2+1])>0){
            int j = k*2+1;
            if( j+1 < size && data[k].compareTo(data[j+1])>0){
                j++;
                swap(k,j);
                k=j;
            }
            swap(k,j);
            k=j;

        }
    }


    // 交换堆中索引为i和j的两个元素
    private void swap(int i, int j){
        E t = data[i];
        data[i] = data[j];
        data[j] = t;
    }

    public static void main(String[] args) {

        MaxHeap<Integer> maxHeap = new MaxHeap<Integer>(100);
        int N = 100; // 堆中元素个数
        int M = 100; // 堆中元素取值范围[0, M)
        for( int i = 0 ; i < N ; i ++ )
            maxHeap.add( new Integer((int)(Math.random() * M)) );

        Integer[] arr = new Integer[N];
        // 将maxheap中的数据逐渐使用extractMax取出来
        // 取出来的顺序应该是按照从大到小的顺序取出来的
        for( int i = 0 ; i < N ; i ++ ){
            arr[i] = maxHeap.extractMax();
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 确保arr数组是从大到小排列的
        for( int i = 1 ; i < N ; i ++ )
            assert arr[i-1] >= arr[i];
    }

}
