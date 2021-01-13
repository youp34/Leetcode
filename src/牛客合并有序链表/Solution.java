package 牛客合并有序链表;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/1/11 10:31
 */


class ListNode {
    int val;
    ListNode next;
}
public class Solution {
    public ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode temp = res;
        while (l1 != null && l2 != null){
            if (l1.val > l2.val){
                temp.next = l2;
                l2 = l2.next;
            }else {
                temp.next = l1;
                l1 = l1.next;
            }
            temp = temp.next;
        }
        if (l1 != null){
            temp.next = l1;
        }
        if (l2 != null){
            temp.next = l2;
        }
        return res;
    }
}
