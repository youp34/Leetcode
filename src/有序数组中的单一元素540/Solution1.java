package 有序数组中的单一元素540;

/**
 * O(log n)时间复杂度
 * 通过奇数偶数判断 二分查找
 *
 */
public class Solution1 {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) return nums[0];
        int l = 0;
        int r = nums.length;
        int mid;
        while (l+1 != r){
            mid = (l+r)/2;
            System.out.println(l+"===="+mid+"==="+r);
            if (mid%2 == 0){
                if (nums[mid] != nums[mid-1]) l = mid;
                else r = mid;
            }else {
                if (nums[mid] == nums[mid-1]) l = mid;
                else r = mid;
            }
        }
        return nums[l];
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int[] a = {1,2,2,3,3};
        System.out.println(solution.singleNonDuplicate(a));
    }
}
