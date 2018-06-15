public class BubbleSort {
    private BubbleSort(){}


    public static void sort(Comparable[] arr){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr.length-i-1; j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    public static void swap(Comparable[] arr,int i , int j){
        Comparable e = arr[i];
        arr[i] = arr[j];
        arr[j] = e;
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{4,12,123,4,123,55,34,122,31,1};
        sort(arr);
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
