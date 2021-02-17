package 买卖股票的最佳时机121;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/2/17 15:09
 */
public class Solution1 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0){
            return 0;
        }
        int max = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min){
                min = prices[i];
            }else if (max < prices[i]-min){
                max = prices[i]-min;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] a = {7,1,5,3,6,4};
        System.out.println(solution1.maxProfit(a));
    }
}
