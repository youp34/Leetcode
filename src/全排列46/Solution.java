package 全排列46;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/3/13 17:33
 */
public class Solution  {
    private List<List<Integer>> re = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] t = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            t[i] = false;
        }
        dfs(nums,t,new ArrayList<>());
        return re;
    }
    public void dfs(int[] nums,boolean[] t,List<Integer> res){
        if (res.size() == nums.length){
            re.add(new ArrayList<Integer>(res));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!t[i]){
                res.add(nums[i]);
                t[i] = true;
                dfs(nums,t,res);
                t[i] = false;
                res.remove(res.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] list = new int[]{1,2,3};
        System.out.println(solution.permute(list));
    }
}
