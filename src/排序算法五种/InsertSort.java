package 排序算法五种;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/2/20 14:17
 *
 * 插入排序
 * 稳定
 * O(n2)
 */
public class InsertSort {
    public int[] sort(int[] list){
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < i; j++) {
                if (list[i] < list[j]){
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] a = {2,5,1,4,1,9};
        InsertSort insertSort = new InsertSort();
        int[] sort = insertSort.sort(a);
        for (int i : sort) {
            System.out.println(i);
        }
    }
}
