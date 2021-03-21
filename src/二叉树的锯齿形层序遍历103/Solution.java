package 二叉树的锯齿形层序遍历103;

import java.util.*;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/3/21 16:53
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<List<Integer>> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        List<Integer> list;
        while (!queue.isEmpty()){
            list = new ArrayList<>();
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode poll = queue.poll();
                list.add(poll.val);
                if(poll.left != null){
                    queue.offer(poll.left);
                }
                if (poll.right != null){
                    queue.offer(poll.right);
                }
            }
            if (res.size()%2 == 1){
                Collections.reverse(list);
            }
            res.add(list);
        }
        return res;
    }
}
