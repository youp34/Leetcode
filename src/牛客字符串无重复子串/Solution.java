package 牛客字符串无重复子串;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/1/15 10:55
 * 记住特殊情况 测试数据
 */
public class Solution {
    public int maxLength (int[] arr) {
        if(arr.length < 2)
            return arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = 1;

        for(int start=0, end=0; end < arr.length; end++){
        /*当某个数在之前出现过，这个时候就把子串的起点start往后推一个，但是有一种情况，
        比如1，2，3，4，3，5，1。到第二个3时，以后的子串起点start为4，
        到第二个1时，如果不取最大的start，按start = map.get(arr[end])+1
        算出起点start为2，显然以起点start=2，结尾end=1的子串234351有重复的，
        因此start要取最大的
            */
            if(map.containsKey(arr[end])){
                start = Math.max(start,map.get(arr[end])+1);
            }
            res = Math.max(res,end-start+1);
            map.put(arr[end],end);
        }

        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1,3,2,4,3,1,5};
        System.out.println(solution.maxLength(a));
    }
}
