package 分发饼干455;

import java.util.Arrays;

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);  //先将饼干 和 孩子所需大小都进行排序
        Arrays.sort(s);
        int child = 0;
        int cookie = 0;
        while (child<g.length && cookie<s.length){
            if (s[cookie]<g[child]){
                cookie++;
            }else {
                child++;
                cookie++;
            }
        }
        return child;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {10,9,8,7};
        int[] b = {5,6,7,8};
        System.out.println(solution.findContentChildren(a,b));
    }
}
