package 排序算法五种;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/2/20 13:55
 *
 * 冒泡排序
 * 稳定
 * O(n2)
 */
public class BubbingSort {
    public int[] sort(int[] list){
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length-i-1; j++) {
                if (list[j] > list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] a = {2,5,1,4,1,9};
        BubbingSort bubbingSort = new BubbingSort();
        int[] sort = bubbingSort.sort(a);
        for (int i : sort) {
            System.out.println(i);
        }
    }
}
