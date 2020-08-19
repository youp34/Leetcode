package 合并两个有序链表21;


import java.util.List;
import java.util.prefs.NodeChangeEvent;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2020/8/18 14:29
 */
//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(1);
        ListNode temp = res;
        while (l2 != null && l1 != null){
            if (l2.val > l1.val){
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
            } else{
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
            }
            System.out.println(temp.val);
        }
        if (l2 == null) temp.next = l1;
        else temp.next = l2;
        return res.next;
    }
}
