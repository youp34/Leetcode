package 无重复字符的最长子串3;

import java.util.HashMap;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/2/26 9:02
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        if (chars.length < 2){
            return chars.length;
        }
        int res = 1;
        HashMap map = new HashMap<String, Integer>();
        int star = 0;
        int end  = 0;
        for (end = 0;end<chars.length;end++){
            if (map.containsKey(chars[end])){
                star = Math.max(star,(int)map.get(chars[end])+1);
            }
            res = Math.max(res,end-star+1);
            map.put(chars[end],end);
        }
        return res;
    }

    public static void main(String[] args) {
        String a = "abcabcbb";
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring(a));
    }
}
