package 有序数组中的单一元素540;

/**
 * 传统暴力方法 O(log n)
 */
public class Solution {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) return nums[0];
        for (int i = 1; i < nums.length; i = i+2) {
            if (nums[i-1] != nums[i]) return nums[i-1];
        }
        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1,1,2};
        System.out.println(solution.singleNonDuplicate(a));
    }
}
