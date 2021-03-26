package 根到叶子节点数字之和129;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/3/26 12:01
 */

public class Solution1 {
    private List<Integer> list = new ArrayList<>();
    public int sumNumbers(TreeNode root) {
        int res = 0;
        if (root == null){
            return res;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(root.val);
        dfs(stringBuilder,root);
        for (int i = 0; i < list.size(); i++) {
            res = res + list.get(i);
        }
        return res;
    }
    void dfs(StringBuilder chain,TreeNode node){
        if (node.left == null && node.right == null){
            list.add(Integer.valueOf(chain.toString()));
            return;
        }
        if (node.left!= null){
            chain.append(node.left.val);
            dfs(chain,node.left);
            chain.deleteCharAt(chain.length()-1);
        }

        if (node.right!= null){
            chain.append(node.right.val);
            dfs(chain,node.right);
            chain.deleteCharAt(chain.length()-1);
        }
    }
}
