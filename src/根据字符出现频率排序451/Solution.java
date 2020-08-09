package 根据字符出现频率排序451;

import javax.sound.midi.Soundbank;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    public String frequencySort(String s) {
        char[] chars = s.toCharArray();
        Map<Character ,Integer> map = new HashMap<>();
        for (int i=0;i<chars.length;i++){
            if (map.containsKey(chars[i]))
                map.put(chars[i],map.get(chars[i])+1);
            else map.put(chars[i],1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> priorityQueue = new PriorityQueue<>(
                new Comparator<Map.Entry<Character, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                        return o2.getValue()-o1.getValue();
                    }
                }
        );
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            //System.out.println(entry);
            priorityQueue.offer(entry);
        }
        StringBuilder res = new StringBuilder();
        while (!priorityQueue.isEmpty()){
            Map.Entry<Character,Integer> temp = priorityQueue.poll();
            for (int i=0;i<temp.getValue();i++){
                //System.out.println(temp.getKey()+"========"+temp.getValue());
                res.append(temp.getKey());
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.frequencySort("cccaaa"));
    }
}
