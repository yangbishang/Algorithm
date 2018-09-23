// 递归求斐波那契数列
// 重叠子问题
public class _01_Fibonacci {
    private int num = 0;

    public int fib( int n ){

        num ++;

        if( n == 0 )
            return 0;
        if( n == 1 )
            return 1;

        return fib(n-1) + fib(n-2);
    }
}
