package 序列化二叉树剑指offer37;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/2/28 19:20
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null){
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        stringBuilder.append("[");
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode poll = queue.poll();
            if (poll != null){
                queue.offer(poll.left);
                queue.offer(poll.right);
                stringBuilder.append(poll.val+",");
            }else {
                stringBuilder.append("null,");
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if ("[]".equals(data)){
            return null;
        }
        String[] split = data.substring(1, data.length() - 1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(split[0]));
        LinkedList<Object> res = new LinkedList<>();
        res.offer(root);
        int i = 1;
        while (!res.isEmpty()){
            TreeNode poll = (TreeNode) res.poll();
            if (!"null".equals(split[i])){
                TreeNode node = new TreeNode(Integer.parseInt(split[i]));
                poll.left = node;
                res.offer(node);
            }
            i++;
            if (!"null".equals(split[i])){
                TreeNode node = new TreeNode(Integer.parseInt(split[i]));
                poll.right = node;
                res.offer(node);
            }
            i++;
        }
        return root;
    }
}

