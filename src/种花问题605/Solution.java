package 种花问题605;

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int[] arry = new int[flowerbed.length+2];
        arry[0] = 0;
        arry[arry.length-1] = 0;
        for (int i = 1; i < arry.length-1; i++) {
            arry[i] = flowerbed[i-1];
        }
        int count = 0;
        for (int i = 1; i < arry.length-1; i++) {
            if (arry[i-1] == 0 && arry[i] == 0 && arry[i+1] ==0){
                count++;
                i++;
            }
        }
        return count >= n;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] l = {1,0,0,0,1};
        System.out.println(solution.canPlaceFlowers(l, 1));
    }
}
