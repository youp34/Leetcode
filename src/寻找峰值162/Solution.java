package 寻找峰值162;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/1/5 20:00
 *
 *注意看题目介绍 ！！！
 * 因为nums[-1] = nums[n] = -∞
 * 所以用二分查找无疑是最快得解决方案
 */
public class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 0){
            return -1;
        }
        int l = 0;
        int r = nums.length-1;
        int mid;
        while (l < r){
            mid = (l + r)/2;
            if (nums[mid] < nums[mid+1]){
                l = mid + 1;
            }else {
                r = mid;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,1};
        Solution solution = new Solution();
        System.out.println(solution.findPeakElement(a));
    }
}
