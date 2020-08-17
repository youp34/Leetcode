package 多数元素169;

public class Solution {
    public int majorityElement(int[] nums) {
        int temp = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) temp = nums[i];
            if (temp == nums[i]) count++;
            else count--;
        }
        return temp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {2,2,1,1,1,2,2};
        System.out.println(solution.majorityElement(a));
    }
}
