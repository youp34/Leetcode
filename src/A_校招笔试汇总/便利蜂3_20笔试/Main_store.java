package A_校招笔试汇总.便利蜂3_20笔试;

import java.util.Scanner;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/3/20 14:17
 *
 * ac 73%    呜呜菜鸡！！！
 */
public class Main_store {
    private static StringBuilder stringBuilder = new StringBuilder();
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextLine()){
            String news = cin.nextLine();
            String olds = cin.nextLine();
            String[] splitNew = news.split(",");
            String[] splitOld = olds.split(",");
            int count = 0;
            while (count<splitNew.length && count<splitOld.length){
                String[] splitn = splitNew[count].split("-");
                String[] splito = splitOld[count].split("-");
                if (!splitn[1].equals(splito[1])){
                    String a = "modify-"+ splitn[0] + ",";
                    stringBuilder.append(a);
                }
                count++;
            }
            while (count<splitNew.length){
                String a = "delete-"+splitNew[count].split("-")[0] + ",";
                stringBuilder.append(a);
                count++;
            }
            while (count<splitOld.length){
                String a = "add-"+splitOld[count].split("-")[0] + ",";
                stringBuilder.append(a);
                count++;
            }
            String res = stringBuilder.toString();
            System.out.println(res.substring(0, res.length() - 1));
        }
    }

}
