package x的平方根69;

/**
 * 呜呜呜呜~~~
 * 忠告:能用除法就别用乘法
 */
public class Solution {
    public int mySqrt(int x) {
        if (x <= 1) return x;
        int start = 1;
        int end = x;
        while (start+1 != end){
            int mid = start+(end-start) /2;
            //System.out.println(mid);
            int temp = x/mid;
            if (mid == temp) return mid;
            else if (mid < temp) start = mid;
            else  end = mid;
        }
        return start;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(2147395599));
    }
}
