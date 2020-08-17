package 寻找旋转排序数组中的最小值153;

class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 1) return nums[1];
        int l = 0;
        int r = nums.length;
        int mid;
        while (l+1 != r){
            mid = l + (r-l)/2;
            System.out.println(l+"="+mid+"="+r);
            if (nums[mid] > nums[0]) l = mid;
            else r = mid;
        }
        if (r == nums.length) return nums[0];
        return nums[r];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1,2,3};
        System.out.println(solution.findMin(a));
    }
}
