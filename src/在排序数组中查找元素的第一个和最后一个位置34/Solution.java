package 在排序数组中查找元素的第一个和最后一个位置34;

import java.util.Arrays;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = -1;
        int r = nums.length;
        int mid;
        int[] a = {-1,-1};
        if (nums.length == 0) return a;
        while (l+1 != r){
            mid = l+ (r-l)/2;
            if (nums[mid] < target) l = mid;
            else r = mid;
        }
        System.out.println(r);
        if (r == nums.length) return a;
        if (nums[r] != target) return a;    // 判断数组中是否存在目标值！！！！  不存在直接返回退出程序~！
        a[0] = r;
        l = 0;
        r = nums.length;
        while (l+1 != r){
            mid = l+ (r-l)/2;
            if (nums[mid] > target) r = mid;
            else l = mid;
        }
        a[1] = l;
        return a;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {2,2};
        System.out.println(Arrays.toString(solution.searchRange(a, 3)));
    }
}
