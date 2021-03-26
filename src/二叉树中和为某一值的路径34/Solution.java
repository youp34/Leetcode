package 二叉树中和为某一值的路径34;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/3/26 10:54
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Solution {
    private List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if (root == null) return res;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(root.val);
        dfs(root,list,target-root.val);
        return res;
    }
    public void dfs(TreeNode node,List<Integer> list,Integer sum){
        if (node.left == null && node.right == null){
            if (sum == 0){
                res.add(new ArrayList<>(list));
            }
            return;
        }
        if (node.left != null){
            list.add(node.left.val);
            dfs(node.left,list,sum-node.left.val);
            list.remove(list.size()-1);

        }
        if (node.right != null){
            list.add(node.right.val);
            dfs(node.right,list,sum-node.right.val);
            list.remove(list.size()-1);
        }
    }
}
