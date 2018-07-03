//对于有序数列，才能使用二分查找法
public class _00_BinarySearch {

    private _00_BinarySearch(){
    }

    // 二分查找法,在有序数组arr中,查找target
    // 如果找到target,返回相应的索引index
    // 如果没有找到target,返回-1
    public static int find(Comparable[] arr, Comparable target) {

        // 在arr[l...r]之中查找target
        int l = 0, r = arr.length-1;
        while( l <= r ){

            //int mid = (l + r)/2;
            // 防止极端情况下的整形溢出，使用下面的逻辑求出mid
            int mid = l + (r-l)/2;

            if( arr[mid].compareTo(target) == 0 )
                return mid;

            if( arr[mid].compareTo(target) > 0 )
                r = mid - 1;
            else
                l = mid + 1;
        }

        return -1;
    }



/*

    // 递归的二分查找算法
    public static int find(Comparable[] arr, Comparable target) {
        return find(arr, 0, arr.length-1, target);
    }

    private static int find(Comparable[] arr, int l, int r, Comparable target){

        if( l > r )
            return -1;

        //int mid = (l+r)/2;
        // 防止极端情况下的整形溢出，使用下面的逻辑求出mid
        int mid = l + (r-l)/2;

        if( arr[mid].compareTo(target) == 0 )
            return mid;
        else if( arr[mid].compareTo(target) > 0 )
            return find(arr, l, mid-1, target);
        else
            return find(arr, mid+1, r, target);
    }



 */
}
