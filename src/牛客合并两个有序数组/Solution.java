package 牛客合并两个有序数组;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/1/14 9:28
 */
public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int pa = m-1;
        int pb = n-1;
        int p = m+n-1;
        while (pa>=0&&pb>=0){
            if (A[pa]>B[pb]){
                A[p] = A[pa];
                pa--;
            }else {
                A[p] = B[pb];
                pb--;
            }
            p--;
        }
        while (p>=0){
            A[p] = B[pb];
            pb--;
            p--;
        }
    }
    public void merge1(int A[], int m, int B[], int n) {
        int i=m-1, j=n-1, k=m+n-1;
        while (i>=0 && j>=0) {
            if (A[i] > B[j]) {
                A[k--] = A[i--];
            } else {
                A[k--] = B[j--];
            }
        }
        while (j>=0) {
            A[k--] = B[j--];
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {};
        int[] b = {1};
        solution.merge1(a,0,b,1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
