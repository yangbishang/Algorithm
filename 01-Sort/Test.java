public class Test {
    public static void main(String[] args) {
        int[] a = {4,1,2,5,1,6,3,10,3};
        for(int i=a.length-1 ; i>=1  ; i--){
            for(int j=0 ; j<i ; j++){
                if(a[j] > a[j+1]){
                    swap(a,j,j+1);
                }
            }
        }
       for(int n=0 ; n<a.length ;n++){
           System.out.print(a[n]+"    ");
       }
    }

    public static void swap(int[] a ,int i , int j ){
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
