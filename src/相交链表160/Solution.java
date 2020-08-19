package 相交链表160;

/**
 * 一个链表的爱情故事 哈哈哈  你细品！！！
 */
//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode me = headA;
        ListNode you = headB;
        while (me != you){
            me = me == null ? headB : me.next;
            you = you == null ? headA : you.next;
        }
        return me;
    }
}
