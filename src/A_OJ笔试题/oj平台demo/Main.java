package A_OJ笔试题.oj平台demo;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/3/17 17:19
 *
 * 注：考试期间自己进行 import进行相关的包导入 并运用Java的输入输出打印最终的输出！！！！！！
 *
 * 读一个字符串：String s = sc.next();
 *
 * 读一个浮点数：double t = sc.nextDouble();
 *
 * 读一整行： String s = sc.nextLine();
 */
// 引入包

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // 构建输入类
        Scanner cin = new Scanner(System.in);
        //hasNext()方法判断输入（文件、字符串、键盘等输入流）是否还有下一个输入项，若有，返回true，反之false。
        while (cin.hasNext()){
            //int 类型
            int a = cin.nextInt();
            System.out.println(a);
            // String类型
            String b = cin.next();
            System.out.println(b);
            //float 类型
            float c = cin.nextFloat();
            System.out.println(c);
            //byte类型 该类型只能存储-128 - 127的数值
            byte d = cin.nextByte();
            System.out.println(d);
            //读取一行
            String f = cin.nextLine();
            System.out.println(f);
        }
    }
}
