package 牛客斐波那契数列;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/1/13 11:29
 */
public class Solution {
    //递归模式
    public int Fibonacci(int n) {
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
    // 普通模式  指针的方式
    public int Fib(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        int l = 1;
        int r = 1;
        int res = 0;
        for (int i = 2; i < n; i++) {
            res = l + r;
            l = r;
            r = res;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.Fibonacci(5 ));
        System.out.println(solution.Fib(4));
    }
}
