package 划分字母区间763;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> res = new ArrayList<>();
        int start = 0;
        int end = 0;
        while (start < S.length()){
            end = S.lastIndexOf(S.charAt(start));
            int temp = start;
            while (temp<end){
                temp++;
                if (S.lastIndexOf(S.charAt(temp)) > end) end = S.lastIndexOf(S.charAt(temp));
            }
            res.add(end-start+1);
            start = temp+1;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.partitionLabels("ababcbacadefegdehijhklij"));
    }
}
