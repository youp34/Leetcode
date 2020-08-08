package 前K个高频单词692;

import java.util.*;

public class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        // 将数组中的words进行统计 词频。
        for (int i=0; i<words.length; i++){
            if (map.containsKey(words[i]))
                map.put(words[i],map.get(words[i])+1);
            else map.put(words[i],1);
        }
        // 创建一个堆
        PriorityQueue<Map.Entry<String ,Integer>> priorityQueue = new PriorityQueue<>(
                new Comparator<Map.Entry<String, Integer>>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        if (o1.getValue() == o2.getValue())
                            return o2.getKey().compareTo(o1.getKey());
                        else
                            return o1.getValue() - o2.getValue();
                    }
                }
        );
        // 放入堆中
        for (Map.Entry<String ,Integer> entry : map.entrySet()){
            priorityQueue.offer(entry);
            if (priorityQueue.size()>k)
                priorityQueue.poll();
        }
        // 存入返回数组
        while (!priorityQueue.isEmpty())
            res.add(0,priorityQueue.poll().getKey());
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] arry = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        System.out.println(solution.topKFrequent(arry, 4));
    }
}
