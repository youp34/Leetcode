package 删除链表重复值剑指offer;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/6/3 20:19
 *
 *在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 *
 * 牛客  https://www.nowcoder.com/practice/fc533c45b73a41b0b44ccba763f866ef?tpId=13&tqId=11209&rp=4&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode deleteDuplication(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode root = new ListNode(Integer.MIN_VALUE);
        root = head.next;
        ListNode res = root;
        ListNode p = root.next;
        while (p != null){
            if (p.next != null && p.val == p.next.val){
                while (p.next != null && p.val == p.next.val){
                    p = p.next;
                }
                p = p.next;
                root.next = p;
            }else {
                root = p;
                p = p.next;
            }
        }
        return res.next;
    }
}
