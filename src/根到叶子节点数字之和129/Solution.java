package 根到叶子节点数字之和129;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/2/20 17:34
 *
 * 本质  树的前序遍历
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
class Solution {
    private int res = 0;
    public int sumNumbers(TreeNode root) {
        doSum(0,root);
        return res;
    }
    public void doSum(int num,TreeNode node){
        if (node == null){
            return;
        }
        int k = num*10+node.val;
        if (node.left == null&&node.right == null){
            res = res + k;
        }
        doSum(k,node.left);
        doSum(k,node.right);
    }
}
