package 二叉树的右视图199;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/2/28 20:39
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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        LinkedList<Object> list = new LinkedList<>();
        list.offer(root);
        while (!list.isEmpty()){
            int size = list.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = (TreeNode) list.poll();
                if (poll.left != null){
                    list.offer(poll.left);
                }
                if (poll.right != null){
                    list.offer(poll.right);
                }
                if (i == size-1){
                    res.add(poll.val);
                }
            }
        }
        return res;
    }
}
