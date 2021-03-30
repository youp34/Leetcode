package A_校招笔试汇总.A_OJ笔试题;

import java.util.Scanner;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/3/28 19:39
 */
public class Mian {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()){
            String next = cin.nextLine();
            String s = cin.nextLine();
            String[] grade = s.split(" ");
            int[] l = new int[grade.length+2];
            l[0] = 0;
            l[1] = 0;
            for (int i = 2; i < l.length; i++) {
                l[i] = Integer.valueOf(grade[i-2]);
            }
            int res = 0;
            for (int i = 1; i < l.length; i++) {
                for (int j = i+1; j < l.length; j++) {
                    if (i != j){
                        System.out.println(res + "======" +  i + "--"+ j + "=======" + (l[j] | l[i]));
                        res = res + (l[j] | l[i]);
                    }
                }
            }
            System.out.println(res);
        }
    }
}
