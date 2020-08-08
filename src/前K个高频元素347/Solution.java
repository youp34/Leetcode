package 前K个高频元素347;

import java.util.*;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] a = new int[k];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else map.put(nums[i],1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> priorityQueue = new PriorityQueue<>(
                new Comparator<Map.Entry<Integer, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                        return o1.getValue()-o2.getValue();
                    }
                }
        );
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            priorityQueue.offer(entry);
            if (priorityQueue.size()>k)
                priorityQueue.poll();
        }
        while (!priorityQueue.isEmpty()){
            a[k-1] = priorityQueue.poll().getKey();
            k--;
        }
        return a;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1};
        System.out.println(Arrays.toString(solution.topKFrequent(nums, 1)));
    }
}
