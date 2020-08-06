package 通过删除字母匹配到字典里最长单词524;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public String findLongestWord(String s, List<String> d) {
        String ret = "";
        char[] temp = s.toCharArray();
        int lens = temp.length-1;
        for (String p:d){
            boolean flag = false;
            String ret1 = "";
            char[] list = p.toCharArray();
            int lend = list.length-1;
            int i = 0;
            int j = 0;
            while (i <= lens){
                if (temp[i] == list[j]){
                    if (lend == j){
                        //System.out.println(p);
                        ret1 = p;
                        flag = true;
                        break;
                    }
                    i++;
                    j++;
                }else {
                    i++;
                }
            }
            if (flag){
                if (ret.toCharArray().length < ret1.toCharArray().length){
                    ret = ret1;
                   // System.out.println(ret+"================"+ret1);
                }else if (ret.compareTo(ret1) > 0 && ret.toCharArray().length <= ret1.toCharArray().length){
                        ret = ret1;
                    //System.out.println("sad"+"----------"+ret+"================"+ret1);
                }
            }else {
                ret1 = "";
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> list = new ArrayList<>(Arrays.asList("ba","ab","a","b"));
        System.out.println(solution.findLongestWord("bab", list));
    }
}
