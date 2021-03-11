package 删除字符串中的所有相邻重复项1047;

import java.util.Stack;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/3/11 20:57
 */
public class Solution {
    public String removeDuplicates(String S) {
        char[] chars = S.toCharArray();
        if (chars.length == 0){
            return "";
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (stack.empty() || chars[i] != stack.peek()){
                stack.push(chars[i]);
            }else {
                stack.pop();
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character s : stack) {
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }
}
