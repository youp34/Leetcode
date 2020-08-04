package 反转字符串中的元音字母345;

import java.util.Arrays;
import java.util.HashSet;

public class Demo {
    private final static HashSet sq = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    public String reverseVowels(String s) {
        char[] list = s.toCharArray();
        int i = 0;
        int j = list.length-1;
        char temp;
        while(i < j){
            if(!sq.contains(list[i])){
                i++;
            }else if(!sq.contains(list[j])){
                j--;
            } else{
                temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                i++;
                j--;
            }
        }
        return new String(list);
    }

    public static void main(String[] args) {
        Demo a = new Demo();
        System.out.println(a.reverseVowels("leetcode"));
    }
}
