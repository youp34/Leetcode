package A_校招笔试汇总.腾讯;

import java.util.ArrayList;
import java.util.LinkedList;

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
/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/4/4 20:05
 */
public class FullTree {
    public TreeNode solve (TreeNode root) {
        // write code here
        ArrayList<TreeNode> treeNodes;
        LinkedList<TreeNode> list = new LinkedList<>();
        list.offer(root);
        boolean flag = true;
        while (!list.isEmpty()){
            int len = list.size();
            treeNodes = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode poll = list.poll();
                if (poll.left!= null){
                    treeNodes.add(root.left);
                }else {
                    flag = false;
                    break;
                }
                if (poll.right != null){
                    treeNodes.add(root.right);
                }else {
                    flag = false;
                    break;
                }
            }
            if (flag){
                for (int i = 0; i < treeNodes.size(); i++) {
                    list.offer(new TreeNode(treeNodes.get(i).val));
                }
            }
        }
        LinkedList<TreeNode> l = new LinkedList<>();
        TreeNode res = new TreeNode(list.get(0).val);
        l.offer(res);
        int i = 1;
        TreeNode node;
        while (!l.isEmpty() && i< list.size()){
            TreeNode poll = l.poll();
            node = new TreeNode(list.get(i).val);
            poll.left = node;
            l.offer(poll.left);
            i++;
            node = new TreeNode(list.get(i).val);
            poll.right = node;
            l.offer(poll.right);
            i++;
        }
        return res;
    }
}
