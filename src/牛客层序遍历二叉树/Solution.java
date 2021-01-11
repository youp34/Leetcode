package 牛客层序遍历二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/1/11 9:01
 * 运用队列的方法解决   添加出队的时候向队列添加他的左右子孩子
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
}

public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            ArrayList<Integer> c = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode a = queue.poll();
                c.add(a.val);
                if (a.left != null){
                    queue.offer(a.left);
                }
                if (a.right != null){
                    queue.offer(a.right);
                }
            }
            res.add(c);
        }
        return res;
    }
}
