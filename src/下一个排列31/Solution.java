package 下一个排列31;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/3/2 10:32
 */
public class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        while (i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if (i>=0){
            int j = nums.length-1;
            while (j>=0 && nums[i]>=nums[j]){
                j--;
            }
            swap(nums,i,j);
        }
        revers(nums,i);
    }
    private void swap(int[] list,int l,int r){
         int temp = list[l];
         list[l] = list[r];
         list[r] = temp;
    }
    private void revers(int[] list,int l){
        int le = 1 + l;
        int r = list.length-1;
        while (le<r){
            swap(list,le,r);
            le++;
            r--;
        }
    }
}
