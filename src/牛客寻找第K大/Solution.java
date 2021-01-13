package 牛客寻找第K大;

import java.util.PriorityQueue;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/1/11 11:00
 * 最小堆  方法
 */
public class Solution {
    public int findKth(int[] a, int n, int K) {
        // write code here
        PriorityQueue<Integer> heap = new PriorityQueue<>(K);
        if (a.length == 0){
            throw new RuntimeException("shacha");
        }
        for (int i = 0; i < a.length; i++) {
            if (heap.size() < K){
                heap.offer(a[i]);
            }else if (a[i]>heap.peek()){
                heap.poll();
                heap.offer(a[i]);
            }
        }
        return heap.peek();
    }
}
