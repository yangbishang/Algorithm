import java.lang.reflect.Array;
import java.util.Arrays;

/**

 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

 注意：给定 n 是一个正整数。

 示例 1：

 输入： 2
 输出： 2
 解释： 有两种方法可以爬到楼顶。
 1.  1 阶 + 1 阶
 2.  2 阶
 示例 2：

 输入： 3
 输出： 3
 解释： 有三种方法可以爬到楼顶。
 1.  1 阶 + 1 阶 + 1 阶
 2.  1 阶 + 2 阶
 3.  2 阶 + 1 阶
 */
public class Solution_70 {

    private int[] memo;
    public int climbStairs(int n) {
        memo = new int[n+1];  //记得一定是n+1啊
        Arrays.fill(memo , -1);
        return climbStairs(n , memo);
    }

    private int climbStairs(int n , int[] memo){
        if(n==1)
            return 1;
        if(n==2)
            return 2;

        if(memo[n] == -1)
            memo[n] = climbStairs(n-1,memo)+climbStairs(n-2,memo);

        return memo[n];
    }
}
