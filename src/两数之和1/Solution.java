package 两数之和1;

import A_校招笔试汇总.腾讯.Sol;

import java.util.Arrays;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/6/3 18:40
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        Arrays.sort(nums);
        while(l<r){
            if(nums[l]+nums[r] == target){
                return new int[]{l,r};
            }
            if(nums[l]+nums[r] < target){
                l++;
            }else if(nums[l]+nums[r] > target){
                r--;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = new int[]{3,2,4};
        solution.twoSum(a,6);
    }
}
