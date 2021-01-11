package 牛客两数之和;

import java.util.HashMap;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/1/9 14:07
 *
 *
 * 正确应该使用Map的方法
 */
public class Solution {
    public int[] twoSum (int[] numbers, int target) {
        if (numbers.length == 0){
            return new int[]{};
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
             if (map.containsKey(target-numbers[i])){
                 return new int[]{map.get(target-numbers[i])+1,i+1};
             }
             map.put(numbers[i],i);
        }
        throw new RuntimeException("不存在！");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {3,2,4};
        int[] b = solution.twoSum(a, 6);
        for (int i : b) {
            System.out.println(i);
        }
    }
}
