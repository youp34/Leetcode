package 非递减数列665;

public class Solution {
    public boolean checkPossibility(int[] nums) {
        if (nums.length <= 2) return true;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1]>nums[i]){
                if (count < 1)return false;
                count--;
                if (i-2<0 || nums[i-2]<=nums[i]) nums[i-1] = nums[i];
                else if (nums[i-2]>nums[i]) nums[i] = nums[i-1];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {3,4,2,3};
        System.out.println(solution.checkPossibility(a));
    }
}
