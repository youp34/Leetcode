package 环形链表II142;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;
        ListNode p1 = head;
        ListNode p2 = head;
        boolean flag = false;
        while (p2.next != null && p2.next.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2){
                flag = true;
                break;
            }
        }
        while (flag){
            ListNode p = head;
            while (p != p1){
                p = p.next;
                p1 = p1.next;
            }
            return p;
        }
        return null;
    }
}
