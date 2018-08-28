import org.omg.CORBA.INTERNAL;

import java.util.HashMap;
import java.util.Map;

/**
 给定四个包含整数的数组列表 A , B , C , D ,计算有多少个元组 (i, j, k, l) ，使得 A[i] + B[j] + C[k] + D[l] = 0。

 为了使问题简单化，所有的 A, B, C, D 具有相同的长度 N，且 0 ≤ N ≤ 500 。所有整数的范围在 -2^28 到 2^28 - 1 之间，最终结果不会超过 2^31 - 1 。

 例如:

 输入:
 A = [ 1, 2]
 B = [-2,-1]
 C = [-1, 2]
 D = [ 0, 2]

 输出:
 2

 解释:
 两个元组如下:
 1. (0, 0, 0, 1) -> A[0] + B[0] + C[0] + D[1] = 1 + (-2) + (-1) + 2 = 0
 2. (1, 1, 0, 0) -> A[1] + B[1] + C[0] + D[0] = 2 + (-1) + (-1) + 0 = 0

 */
public class Solution_454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        /*
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0; i<C.length; i++){
            for(int j=0; j<D.length; j++){
                if(map.containsKey(C[i]+D[j])){
                    map.put(C[i]+D[j],map.get(C[i]+D[j])+1);
                }else{
                    map.put(C[i]+D[j],1);
                }
            }
        }

        int ret = 0;
        for(int i=0; i<A.length; i++){
            for(int j=0; j<B.length; j++){
                if(map.containsKey(-A[i]-B[j])){
                    ret = ret + map.get(-A[i]-B[j]);
                }
            }
        }

        return ret;
        */

        int sum = 0;
        HashMap<Integer,Integer> map1 = new HashMap();
        for(int i=0; i<A.length; i++){
            for(int j=0; j<B.length; j++){
                sum = A[i] + B[j];
                if(map1.containsKey(sum))
                    map1.put(sum, map1.get(sum)+1);
                else
                    map1.put(sum, 1);
            }
        }

        HashMap<Integer,Integer> map2 = new HashMap();
        for(int i=0; i<C.length; i++){
            for(int j=0; j<D.length; j++){
                sum = C[i] + D[j];
                if(map2.containsKey(sum))
                    map2.put(sum, map2.get(sum)+1);
                else
                    map2.put(sum, 1);
            }
        }
        int ret = 0;
        for(Map.Entry<Integer,Integer>  entry : map1.entrySet() ){
            if(map2.containsKey(-entry.getKey()))
                ret+=entry.getValue()*map2.get(-entry.getKey());

        }

        return ret;

    }


    public static void main(String[] args) {

        int[] a = {1,1,-1 -1};
        int[] b = {-1,-1,1,1};
        int[] c = {1,-1,0,-1};
        int[] d = {1,1,-1,1};
        System.out.println((new Solution_454()).fourSumCount(a, b, c, d));
    }
}
