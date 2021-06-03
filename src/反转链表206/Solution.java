package 反转链表206;

/**
 *
 * @author zhao peng yu
 * @version 1.0
 * @date 2020/8/18 10:38
 * 双指针方法 + 递归
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p1 = null;
        ListNode p2 = head;
        while (p2 != null){
            ListNode temp = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = temp;
        }
        return p1;
    }
    // 二刷
    public ListNode reverseList1(ListNode head) {
        ListNode r = null;
        ListNode l = null;
        while (head != null){
            l = head.next;
            head.next = r;
            r = head;
            head = l;
        }
        return r;
    }
    //递归
    public ListNode reverseList2(ListNode node) {
        if(node == null || node.next == null){
            return node;
        }
        ListNode root = reverseList2(node.next);
        node.next.next = node;
        node.next = null;
        return root;
    }
}
