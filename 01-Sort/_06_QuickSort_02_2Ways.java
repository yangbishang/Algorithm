//当数组元素中含有大量的重复元素时，partition会把数组分成极度不平衡的两个部分，所以也会退化成近似O（n2）的时间复杂度
//现在将大于v和小于v的数放在两端
//此算法是把等于v的值分散到了左右两边，避免的两边数量不平衡的情况
public class _06_QuickSort_02_2Ways {


    private static Integer QuickSort(Comparable[] arg,int l,int r){
        Comparable v = arg[l];
        int i = l+1;
        int j = r;

        while(true){
            while(i<=r && arg[i].compareTo(v)<0) i++;
            while(j>l && arg[j].compareTo(v)>0) j--;
            if(i>j)
                break;
            swap(arg,i,j);
            i++;
            j--;
        }
        swap(arg,l,j);//j在<=v的位置

        return j;
    }

    //私有
    private static void sort(Comparable[] arg,int l,int r){
        if( l >= r )
            return;
        int p = QuickSort(arg,l,r);
        sort(arg,l,p-1);
        sort(arg,p+1,r);
    }


    //公共
    public static void sort(Comparable[] arg){
        int n = arg.length;
        sort(arg,0,n-1);
    }


    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
