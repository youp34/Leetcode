package 牛客两个栈实现队列;

import java.util.Stack;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/1/14 9:03
 */
public class solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
