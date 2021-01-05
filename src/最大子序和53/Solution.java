package 最大子序和53;

/**
 * 动态规划
 */
public class Solution {
    /**
     * 主方法 进行求最大子数段
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {

        if (nums.length == 0) return 0;
        int max = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (nums[i]<max+nums[i]) max = max+nums[i];
            else max = nums[i];
            if (max>res) res = max;
        }
        return res;
    }

    /**
     * 测试方法 主函数
     * @param args
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {-1,2,-1,2,1};
        System.out.println(solution.maxSubArray(a));
    }
}
