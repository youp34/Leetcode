package 牛客LRU缓存设计;

import java.util.*;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/1/8 8:59
 * [[1,1,1],[1,2,2],[1,3,2],[2,1],[1,4,4],[2,2]],3
 *
 * 程序有一些小问题 怀疑牛客的测试数据不足
 */
public class Solution {
    public int[] LRU (int[][] operators, int k) {
        // write code here
        HashMap<Integer,Integer> map = new LinkedHashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int[] operator : operators){
            switch (operator[0]){
                // 放入缓存
                case 1:
                    if (map.size()<k){
                        map.put(operator[1],operator[2]);
                    }else {
                        map.remove(map.keySet().toArray()[0]);
                        map.put(operator[1],operator[2]);
                    }
                    break;
                    // 取数据
                case 2:
                    if (map.containsKey(operator[1])){
                        int val = map.get(operator[1]);
                        res.add(val);
                        map.remove(operator[1]);
                        map.put(operator[1],val);

                    }else {
                        res.add(-1);
                    }
                    break;
                default:
            }
        }
        int[] a = new int[res.size()];
        int j = 0;
        for (int i: res) {
            a[j] = i;
            j++;
        }
        return a;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] a = {{1,1,1},{1,2,2},{1,3,2},{2,1},{1,4,4},{2,2}};
        int[] b = solution.LRU(a,3);
        for (int i : b) {
            System.out.println(i);
        }
    }
}
