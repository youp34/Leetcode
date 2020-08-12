package 根据身高重建队列406;

import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        if (people.length == 0|| people == null || people[0].length == 0) return new int[0][0];
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) return o1[1]-o2[1];
                else return o2[0]-o1[0];
            }
        });
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < people.length; i++) {
            list.add(people[i][1],people[i]);
        }
        int[][] res = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        /*for (int i = 0; i <res.length ; i++) {
            System.out.print(Arrays.toString(res[i]));
        }*/
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] a = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        solution.reconstructQueue(a);
    }
}
