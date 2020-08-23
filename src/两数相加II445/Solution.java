package 两数相加II445;

import jdk.dynalink.linker.support.CompositeGuardingDynamicLinker;

import java.lang.reflect.InvocationTargetException;
import java.util.Stack;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2020/8/23 7:53
 */

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = buildStack(l1);
        Stack<Integer> s2 = buildStack(l2);
        ListNode res = new ListNode(1);
        int temp = 0;
        while (!s1.empty() && !s2.empty()){
            int num1 = s1.pop();
            int num2 = s2.pop();
            int sum = num1 + num2 + temp;
            temp = 0;
            ListNode node = new ListNode(sum%10);
            node.next = res.next;
            res.next = node;
            temp = sum/10;
        }
        if (temp != 0){
            ListNode node = new ListNode(temp);
            node.next = res.next;
            res.next = node;
        }
        while (!s2.empty()){
            int sum = s2.pop() + temp;
            temp = sum/10;
            ListNode node = new ListNode(sum%10);
            node.next = res.next;
            res.next = node;
        }
        while (!s1.empty()){
            int sum = s1.pop() + temp;
            temp = sum/10;
            ListNode node = new ListNode(sum%10);
            node.next = res.next;
            res.next = node;
        }
        return res.next;
    }
    private Stack<Integer> buildStack(ListNode l){
        Stack<Integer> stack = new Stack<>();
        while (l != null){
            stack.push(l.val);
            l = l.next;
        }
        return stack;
    }

}
