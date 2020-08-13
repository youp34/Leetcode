package 买卖股票的最佳时机121;

/**
 * 暴力解法  两层for循环
 */
public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int max = 0;
        int min = 0;
        for (int i = 0; i < prices.length-1; i++) {
            min = prices[i];
            for (int j = i+1; j < prices.length; j++) {
                if (max<(prices[j]-min))
                    max = prices[j]-min;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {7,6,4,3,1};
        System.out.println(solution.maxProfit(a));
    }
}
