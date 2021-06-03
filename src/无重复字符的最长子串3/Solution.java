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
        HashMap map = new HashMap<Character, Integer>();
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
    public int lengthOfLongestSubstring1(String s) {
        if(s.length() <= 1){
            return s.length();
        }
        int max = 1;
        int start = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for(int i = 0;i<chars.length;i++){
            if(map.containsKey(chars[i])){
                start = Math.max(start,map.get(chars[i]) +1);
            }
            max = Math.max(max,i-start+1);
            map.put(chars[i],i);
        }
        return max;
    }

    public static void main(String[] args) {
        String a = "dvdf";
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring1(a));
    }
}
