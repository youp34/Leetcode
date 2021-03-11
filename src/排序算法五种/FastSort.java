package 排序算法五种;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/2/20 14:26
 *
 * 快速排序
 * 不稳定
 * O(nlog(n))
 */
public class FastSort {

    public static void fastSort(int[] list,int l,int r){
        if (l>=r){
            return;
        }
        int left = l;
        int right = r;

        // 先把第一个比较值假设从数组中拿出
        int temp = list[l];
        //两个指针向内移动
        while (l<r){
            while (temp <list[r] && l<r){
                r--;
            }
            //占用比较值位置
            if (l<r){
                list[l] = list[r];
            }
            while (temp >= list[l] && l<r){
                l++;
            }
            if (l<r){
                list[r] = list[l];
            }
        }
        if (l>=r){
            list[l] = temp;
        }
        fastSort(list,left,l-1);
        fastSort(list,l+1,right);
    }

    public static void main(String[] args) {
        int[] a = {2,5,1,4,1,9};
        fastSort(a,0,a.length-1);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
