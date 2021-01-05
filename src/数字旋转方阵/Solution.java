package 数字旋转方阵;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2020/9/30 8:00
 * 分治法 分为四个字问题进行计算
 */
public class Solution {
    public int[][]  generateRotate(int size){
        // 循环几次！
        int k = size/2 +1;
        int q = 0;
        int[][] res = new int[size][size];
        int i = 0;
        int j = 0;
        // 数据从1开始旋转
        int num = 1;
        if (size == 0) {
            return res;
        }
        if (size == 1) {
            res[i][j] = num;
            return res;
        }
        while (q < k-1){
            //第一区域
            while (i < size-1){
                res[i][j] = num;
                num++;
                i++;
            }
            //第二区域、
            while (j < size-1){
                res[i][j] = num;
                num++;
                j++;
            }
            // 第三区域
            while (i > q){
                res[i][j] = num;
                i--;
                num++;
            }
            // 第四区域
            while (j > q){
                res[i][j] = num;
                j--;
                num++;
            }
            q++;
            size = size - 1;
            i++;
            j++;
            res[i][j] = num;
        }
        return res;
    }

    public static void main(String[] args) {
        int size = 5;
        Solution solution = new Solution();
        int[][] a = solution.generateRotate(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(a[i][j] + "|");
            }
            System.out.println();
        }
    }
}
