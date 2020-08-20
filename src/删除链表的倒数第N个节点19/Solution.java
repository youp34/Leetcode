package 删除链表的倒数第N个节点19;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2020/8/20 8:51
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class  Solution  {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(1);
        res.next = head;
        if (head == null) return head;
        ListNode l = res;
        ListNode r = res;
        for (int i = 0; i <= n; i++) {
            r = r.next;
        }
        while (r != null){
            l = l.next;
            r = r.next;
        }
        System.out.println(l.val);
        l.next = l.next.next;
        return res.next;
    }
}
