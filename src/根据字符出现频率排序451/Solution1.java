package 根据字符出现频率排序451;

/**
 * 动态规划 贪心策略 一层for循环解决问题
 */
public class Solution1 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int max = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) min = prices[i];
            else if (max<prices[i]-min) max = prices[i]-min;
        }
        return max;
    }
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int[] a = {7,1,5,3,6,4};
        System.out.println(solution.maxProfit(a));
    }
}
