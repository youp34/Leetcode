package 判断子序列392;


public class Solution {
    public boolean isSubsequence(String s, String t) {
        /*if (t == "") return false;
        if (s == "") return true;*/
        char[] ls = s.toCharArray();
        char[] lt = t.toCharArray();
        if (ls.length == 0) return true;
        if (lt.length == 0) return false;
        int i = 0;
        int j = 0;
        while (i < ls.length && j < lt.length){
            if (ls[i] == lt[j]){
                if (i == ls.length-1) return true;
                i++;
                j++;
            } else j++;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isSubsequence("", "ahbgdc"));
    }
}
