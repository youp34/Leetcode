package 合并两个有序数组88;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int p = m+n-1;
        while (p1>=0 || p2>=0){
            if (p1<0){
                nums1[p] = nums2[p2];
                p--;
                p2--;
            } else if (p2<0){
                nums1[p] = nums1[p1];
                p--;
                p1--;
            }else if (nums1[p1]>nums2[p2]){
                nums1[p] = nums1[p1];
                p--;
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p--;
                p2--;
            }
        }
        for (int i = 0;i< m+n;i++){
            System.out.println(nums1[i]);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {0};
        int[] nums2 = {1};
        solution.merge(nums1,0,nums2,1);
    }
}
