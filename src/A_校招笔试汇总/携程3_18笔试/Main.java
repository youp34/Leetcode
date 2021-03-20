package A_校招笔试汇总.携程3_18笔试; /**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/3/18 19:23
 *
 * AC 67%
 */
import java.util.*;

public class Main {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int calcSimilarity(String name1, String name2) {
        String[] one = name1.split(" ");
        String[] two = name2.split(" ");
        int sum = 0;
        int count = 0;
        while (count < one.length && count < two.length){
            char[] chars1 = one[count].toCharArray();
            char[] chars2 = two[count].toCharArray();
            int p1 = 0;
            int p2 = 0;
            StringBuilder stringBuilder1 = new StringBuilder();
            StringBuilder stringBuilder2 = new StringBuilder();
            while (p1<chars1.length && p2<chars2.length){
                if (chars1[p1] != chars2[p2]){
                    stringBuilder1.append(chars1[p1]);
                    stringBuilder2.append(chars2[p2]);
                }
                p1++;
                p2++;
            }
            while (p2 < chars2.length){
                stringBuilder2.append(chars2[p2]);
                p2++;
            }
            while (p1 < chars1.length){
                stringBuilder1.append(chars1[p1]);
                p1++;
            }
            sum = sum + toAsc(stringBuilder1.toString()) + toAsc(stringBuilder2.toString());
            count++;
        }
        while (count < one.length){
            sum = sum + toAsc(one[count]);
            count++;
        }
        while (count < two.length){
            sum = sum + toAsc(two[count]);
            count++;
        }
        return sum;
    }
    public static int toAsc(String s){
        char[] chars = s.toCharArray();
        int res = 0;
        for (int i = 0; i < chars.length; i++) {
            res = res + (int) chars[i];
        }
        System.out.println(res);
        return res;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        /*Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String name1 = in.nextLine();
            String name2 = in.nextLine();

            int sum = calcSimilarity(name1, name2);
            System.out.println(sum);
        }*/
        //System.out.println((int) 'S' + (int) 'a' + (int) 'n');
        //System.out.println(calcSimilarity("Zhang San", "Zhan"));
        //System.out.println(calcSimilarity("Ali Ba Ba", "Xie"));
        System.out.println(Arrays.toString("".split(" ")));
    }
}

