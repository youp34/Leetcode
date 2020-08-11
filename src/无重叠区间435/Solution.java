package 无重叠区间435;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length < 2)
            return 0;
        int res = 0;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int p = intervals[0][1];
        /*for (int i = 0; i < intervals.length; i++) {
            System.out.println(Arrays.toString(intervals[i]));
        }*/
        for (int i = 1; i < intervals.length ; i++) {
            if (p > intervals[i][0]) res++;
            else p = intervals[i][1];
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] a = {{1,100},{11,22},{1,11},{2,12}};
        System.out.println(solution.eraseOverlapIntervals(a));
    }
}
