package A_校招笔试汇总.腾讯;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/4/4 20:40
 */
public class Sol {
    public TreeNode solve (TreeNode root) {
        LinkedList<TreeNode> list = new LinkedList<>();
        list.offer(root);
        while (!list.isEmpty()){
            int len = list.size();
            for (int i = 0; i < len; i++) {
                TreeNode poll = list.poll();
                if (poll.left != null){
                    list.offer(poll.left);
                }else {
                    poll.right = null;
                }
                if (poll.right != null){
                    list.offer(poll.right);
                }else {
                    break;
                }
            }
        }
        return root;
    }
}
