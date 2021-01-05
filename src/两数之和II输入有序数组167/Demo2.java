package 两数之和II输入有序数组167;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/1/5 16:46
 */
public class Demo2 {
    public int[] twoSum1(int[] numbers, int target) {
        if (numbers.length == 0){
            return null;
        }
        int l = 0;
        int r = numbers.length - 1;
        while (l < r){
            if (numbers[l] + numbers[r] > target){
                System.out.println(r);
                r--;
            } else if (numbers[l] + numbers[r] < target){
                System.out.println(l);
                l++;
            }else {
                int[] res = {l+1,r+1};
                return res;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] a = {2,7,11,15};
        Demo2 demo2 = new Demo2();
        int[] b = demo2.twoSum1(a, 9);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
    }
}
