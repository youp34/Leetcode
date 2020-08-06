package 数组中的第K个最大元素215;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        int j = nums.length-1;
        int temp;
        int base = 0;
        for (int i=0; i<=j; i++){
            int maxindex = 0;
            for (int q=0; q<=j-i; q++){
                if (nums[q]>nums[maxindex]){
                    maxindex = q;
                }
            }
            base++;
            if (base == k){
                return nums[maxindex];
            }
            if (maxindex != j-i){
                temp = nums[maxindex];
                nums[maxindex] = nums[j-i];
                nums[j-i] = temp;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {3,2,3,1,2,4,5,5,6};
        System.out.println(solution.findKthLargest(a, 4));
    }
}
