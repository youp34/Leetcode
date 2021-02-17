package 买卖股票的最佳时机II122;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i-1]<prices[i]) sum += prices[i]-prices[i-1];
        }
        return sum;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1,2,3,4,5};
        System.out.println(solution.maxProfit(a));
    }












    /**
     * 二次练习
     */
    public int maxProfit1(int[] prices) {
        if (prices.length == 0){
            return 0;
        }
        int max = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i] < prices[i+1]){
                max = max + prices[i+1]-prices[i];
            }
        }
        return max;
    }
}
