package 回文链表234;

import java.lang.reflect.InvocationTargetException;
import java.util.Stack;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2020/8/23 10:14
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        Stack<Integer> stack = new Stack<>();
        ListNode l = head;
        ListNode r = head;
        int i = 1;
        int sum = 0;
        int count = 1;
        while (r != null){
            sum++;
            r = r.next;
        }
        // 前半部分压入栈中
        while (i <= sum){
            if (i > sum/2 && sum%2 == 0){
                int temp = stack.pop();
                System.out.println(l.val);
                if (l.val == temp) l = l.next;
                else return false;
            }else if (i > sum/2 && sum%2 == 1){
                if (count>0){
                    i++;
                    count--;
                }
                l = l.next;
                int temp = stack.pop();
                if (l.val == temp) l = l.next;
                else return false;
            }else {
                stack.push(l.val);
                l = l.next;
            }
            i++;
        }
        return true;
    }
}
