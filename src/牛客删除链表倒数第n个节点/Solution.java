package 牛客删除链表倒数第n个节点;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/1/15 12:41
 */

class ListNode {
    int val;
    ListNode next = null;
}
public class Solution {
    public ListNode removeNthFromEnd (ListNode head, int n) {
        if (head.next == null){
            return null;
        }
        ListNode res = head;
        ListNode slow = head;
        ListNode fast = head;
        int i = 0;
        ListNode temp = null;
        while (i<n){
            i++;
            fast = fast.next;
        }
        while (fast != null){
            temp = slow;
            slow = slow.next;
            fast = fast.next;
        }
        if (temp == null){
            res = res.next;
        }else {
            temp.next = slow.next;
        }
        return res;
    }
}
