package 颜色分类75;

public class Solution {
    public void sortColors(int[] nums) {
        int p1 = 0;
        int p2 = nums.length-1;
        int p = 0;
        int temp;
        while (p <= p2){
            if (nums[p] == 0){
                temp = nums[p];
                nums[p] = nums[p1];
                nums[p1] = temp;
                p++;
                p1++;
            } else if (nums[p] == 2){
                temp = nums[p];
                nums[p] = nums[p2];
                nums[p2] = temp;
                p2--;
            } else if (nums[p] == 1)
                p++;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2,0,2,1,1,2};
        solution.sortColors(nums);
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
    }
}
