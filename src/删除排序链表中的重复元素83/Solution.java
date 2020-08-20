package 删除排序链表中的重复元素83;

import java.util.List;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2020/8/20 8:32
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode l = head;
        ListNode r = head.next;
        while (r != null){
            if (l.val == r.val) {
                l.next = r.next;
                r = r.next;
            } else {
                l = l.next;
                r = r.next;
            }
        }
        return head;
    }
}
