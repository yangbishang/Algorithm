import java.util.Arrays;

/**
 * 有一个背包，它的容量为C（capacity)。现在有n种不同的物品，编号为0...n-1，其中每件物品的
 * 重量为w(i)，价值为v(i)。问可以向这个背包中盛放哪些物品，使得在不超过背包容量的基础上，
 * 物品的总价值最大。
 */
public class knapsack_0_1 {
    //一个背包两个约束条件，每个状态被这两个条件所定义 index c
    private int[][] memo;

    public int knapsack01(int[] w, int[] v, int C){

        if(w == null || v == null || w.length != v.length)
            throw new IllegalArgumentException("Invalid w or v");

        if(C < 0)
            throw new IllegalArgumentException("C must be greater or equal to zero.");

        int n = w.length;
        if(n == 0 || C == 0)
            return 0;

        memo = new int[n][C + 1];
        return bestValue(w, v, n - 1, C);
    }

    // 用 [0...index]的物品,填充容积为c的背包的最大价值
    private int bestValue(int[] w, int[] v, int index, int c){

        if(c <= 0 || index < 0)
            return 0;

        if(memo[index][c] != -1)
            return memo[index][c];

        int res = bestValue(w, v, index-1, c);
        if(c >= w[index])
            res = Math.max(res, v[index] + bestValue(w, v, index - 1, c - w[index]));  //c-w[index]是因为自顶向下

        return memo[index][c] = res;
    }

    public static void main(String[] args) {

    }

}

