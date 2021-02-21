package 剑指Offer45把数组排成最小的数;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/2/20 18:24
 */
public class Solution {
    public String minNumber(int[] nums) {
        List<String> list = new ArrayList<>();
        //加入数组
        for (int num : nums) {
            list.add(String.valueOf(num));
        }
        list.sort(
                new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        int i = (o1 + o2).compareTo(o2 + o1);
                        return i;
                    }
                }
        );
        String res = "";
        for (String s : list) {
            res = res + s;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {3,30,34,5,9};
        Solution solution = new Solution();
        System.out.println(solution.minNumber(a));
    }
}
