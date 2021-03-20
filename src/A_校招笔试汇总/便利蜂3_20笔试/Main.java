package A_校招笔试汇总.便利蜂3_20笔试;

import java.util.Scanner;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/3/20 14:50
 *
 * 没提交上去感觉写的对
 */
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Scanner ci = new Scanner(System.in);
        int sum = 0;
        int res = 0;
        while (cin.hasNext()){
            int i = cin.nextInt();
            for (int i1 = 0; i1 < i; i1++) {
                String s = ci.nextLine();
                String[] split = s.split(",");
                if (sum<Integer.parseInt(split[0])){
                    res = res + sum +Integer.parseInt(split[1]);
                    sum = sum + Integer.parseInt(split[1]);
                } else if (sum >= Integer.parseInt(split[0])){
                    res = res + sum +Integer.parseInt(split[1]) - Integer.parseInt(split[0])+1;
                    sum = sum + Integer.parseInt(split[1]);
                    //System.out.println(res + "==============" + sum);
                }
                System.out.println(sum);
                System.out.println(res);
            }
            System.out.println(res);
        }
    }
}
