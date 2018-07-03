public class MaxHeap<E extends Comparable> {
    private E[] data;
    private int size;
    private int capacity;


    public MaxHeap(){
        this.data = (E[])new Comparable[10];
        this.size = 0;
        this.capacity = 10;
    }
    public MaxHeap(int capacity){
        this.data = (E[])new Comparable[capacity];
        size = 0;
        this.capacity = capacity;
    }

    // 构造函数, 通过一个给定数组创建一个最大堆
    // 该构造堆的过程, 时间复杂度为O(n)
    public MaxHeap(E[] arr){
        int n = arr.length;

        data = (E[])new Comparable[n];
        for(int i = 0 ; i<n ; i++)
            data[i] = arr[i];
        size = n;

        for(int i = (size-1)/2; i>=0 ; i--)
            shiftDown(i);
    }




    public boolean isEmpty(){
        return size==0;
    }

    public int getSize(){
        return size;
    }


    //向堆中添加元素
    public void add(E e){
        if((size) > capacity)
            throw new IllegalArgumentException("the heap capacity is full!");
        data[size] = e;
        size ++ ;
        shiftUp(size-1);
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

        swap(0,size-1);
        size -- ;
        shiftDown(0);
        return e;
    }
    public void shiftDown(int k){
        while(2*k+1 <= size-1){
            int j = 2*k+1;

            if(j+1 <= size-1 && data[j+1].compareTo(data[j]) > 0)     // 二叉堆是完全二叉树，他只满足二个性质：
                j++;                                                   //  1）堆中某个节点的值总是不大于其父节点的值（左右子节点大小随意）
                                                                       //  2）堆总是完全二叉树
            if(data[k].compareTo(data[j])>=0)
                break;

            swap(k,j);
            k=j;

        }

    }
    public E getMax(){
        return data[0];
    }

    // 交换堆中索引为i和j的两个元素
    private void swap(int i, int j){
        E t = data[i];
        data[i] = data[j];
        data[j] = t;
    }



}
