public class Test {
    public static void main(String[] args) {
        Integer[] arr = {12,123,434,12,11,1,323,2,123124,55,4};
        insertSort(arr);
        for(int i = 0 ; i<arr.length ; i++){
            System.out.println(arr[i]+"   ");
        }

    }
    public static void insertSort(Integer[] arr){
        for(int i=0 ; i<arr.length ; i++){
            Integer temp = arr[i];
            int j = i;
            for(; j>0  ; j--){
                if(temp.compareTo(arr[j-1])>0)
                    arr[j] = arr[j-1];
                else{
                    break;
                }
            }
            arr[j] = temp;

        }
    }
    public static void swap(Object[] arr,int i,int j){
        Object temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
