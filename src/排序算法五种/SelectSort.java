package 排序算法五种;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/2/20 14:05
 *
 * 选择排序
 * 不稳定
 * O(n2)
 */
public class SelectSort {
    public int[] sort(int[] list){
        for (int i = 0; i < list.length; i++) {
            int max = 0;
            //每次遍历找到最大的数的下标
            for (int j = 1; j < list.length-i; j++) {
                if (list[max] < list[j]){
                    max = j;
                }
            }
            //交换最后一位
            int temp = list[max];
            list[max] = list[list.length-i-1];
            list[list.length-i-1] = temp;
        }
        return list;
    }
    public static void main(String[] args) {
        int[] a = {2,5,1,4,1,9};
        SelectSort selectSort = new SelectSort();
        int[] sort = selectSort.sort(a);
        for (int i : sort) {
            System.out.println(i);
        }
    }
}
