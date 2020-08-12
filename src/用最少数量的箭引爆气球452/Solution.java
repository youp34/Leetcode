package 用最少数量的箭引爆气球452;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 1;
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int p = points[0][1];
        int s = 0;
        for (int i = 1; i < points.length ; i++) {
            if (p>=points[i][0])
                s++;
            else p = points[i][1];
        }
        return points.length-s;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] a = {{10,16}, {2,8}, {1,6}, {7,12}};
        System.out.println(solution.findMinArrowShots(a));
    }
}
