package 从上到下打印二叉树剑指Offer32I;


import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/3/12 10:07
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Solution {
    public int[] levelOrder(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Object> queue = new LinkedList<>();
        queue.offer(root);
        if (root == null){
            return new int[]{};
        }
        while (!queue.isEmpty()){
            TreeNode poll = (TreeNode) queue.poll();
            list.add(poll.val);
            if (poll.left != null){
                queue.offer(poll.left);
            }
            if (poll.right != null){
                queue.offer(poll.right);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
