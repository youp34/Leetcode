package 两两交换链表中的节点24;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2020/8/20 12:41
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode res = new ListNode(1);
        res.next = head;
        ListNode temp = res;
        ListNode l;
        ListNode r;
        if (head == null || head.next == null) return head;
        while (temp.next != null || temp.next.next != null){
            System.out.println(temp.val);
            l = temp.next;
            r = temp.next.next;
            l.next = r.next;
            r.next = l;
            temp.next = r;
            temp = l;
        }
        return res.next;
    }
}
