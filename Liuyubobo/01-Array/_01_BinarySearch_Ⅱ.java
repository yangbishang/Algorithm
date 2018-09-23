//二分搜索法
//更改了BinarySearch的边界条件
//在[l...r)的范围里寻找target

public class _01_BinarySearch_Ⅱ {

    private _01_BinarySearch_Ⅱ(){}

    public static int binarySearch(Comparable[] arr, int n, Comparable target){

        int l = 0, r = n; // 在[l...r)的范围里寻找target
        while(l < r){    // 当 l == r 时, 区间[l...r)是一个无效区间
            int mid = l + (r - l) / 2;
            if(arr[mid].compareTo(target) == 0) return mid;
            if(target.compareTo(arr[mid]) > 0)
                l = mid + 1;  // target在[mid+1...r)中; [l...mid]一定没有target
            else    // target < arr[mid]
                r = mid;  // target在[l...mid)中; [mid...r)一定没有target
        }

        return -1;
    }
}
