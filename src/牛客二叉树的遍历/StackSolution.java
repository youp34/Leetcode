package 牛客二叉树的遍历;

import java.util.Stack;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/3/19 9:53
 */

public class StackSolution {
    public void qianXu(TreeNode node){
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || node != null){
            while (node != null){
                System.out.println(node.val);
                stack.push(node);
                node = node.left;
            }
            if (!stack.isEmpty()){
                node = stack.pop();
                node = node.right;
            }
        }
    }

}
