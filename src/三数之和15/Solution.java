package 三数之和15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/3/1 20:24
 * 理解： 固定第一个指针依次向后移动  指针后面数据利用双指针实现
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        int len = nums.length;
        if (len < 3){
            return list;
        }
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0){
                break;
            }
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int l = i+1;
            int r = len-1;
            while (l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if (sum > 0){
                    r--;
                }
                if (sum < 0){
                    l++;
                }
                if (sum == 0){
                    List<Integer> integers = Arrays.asList(nums[i], nums[l], nums[r]);
                    while (l<r && nums[l] == nums[l+1]){
                        l++;
                    }
                    while (l<r && nums[r] == nums[r-1]){
                        r--;
                    }
                    list.add(integers);
                    l++;
                    r--;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {-1,0,1,2,-1,-4};
        System.out.println(solution.threeSum(a).toString());
    }
}
