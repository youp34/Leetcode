package 反转字符串344;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/6/19 16:24
 */
public class Solution {
    public void reverseString(char[] s) {
        if(s.length < 2){
            return ;
        }
        int len = s.length;
        int l = 0;
        int r = len-1;
        char temp;
        while(l<r){
            temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
