package 牛客二叉树的遍历;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/1/8 16:00
 */

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
}
public class Solution {
    private ArrayList<Integer> qian = new ArrayList<>();
    private ArrayList<Integer> zhong = new ArrayList<>();
    private ArrayList<Integer> hou = new ArrayList<>();

    public int[][] threeOrders (TreeNode root) {
        if (root == null){
            return new int[][]{{}};
        }else {
            qianXu(root);
            zhongXu(root);
            houXu(root);
        }
        int[][] res = new int[3][qian.size()];
        int j = 0;
        for (int q:qian) {
            res[0][j] = q;
            j++;
        }
        j = 0;
        for (int z:zhong) {
            res[1][j] = z;
            j++;
        }
        j = 0;
        for (int h:hou) {
            res[2][j] = h;
            j++;
        }
        return res;
    }
    public void qianXu(TreeNode root){
        if (root == null){
            return;
        }
        qian.add(root.val);
        qianXu(root.left);
        qianXu(root.right);
    }
    public void zhongXu(TreeNode root){
        if (root == null){
            return;
        }
        zhongXu(root.left);
        zhong.add(root.val);
        zhongXu(root.right);
    }
    public void houXu(TreeNode root){
        if (root == null){
            return;
        }
        houXu(root.left);
        houXu(root.right);
        hou.add(root.val);
    }
}
