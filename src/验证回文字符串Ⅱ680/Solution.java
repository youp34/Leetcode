package 验证回文字符串Ⅱ680;

public class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        char[] list = s.toCharArray();
        int right = list.length-1;
        while (left<right && list[left] == list[right]){
            left++;
            right--;
        }
        if (left>=right){
            return true;
        }
        return compare(s.substring(left+1,right+1)) || compare(s.substring(left,right));
    }
    private boolean compare(String s){
        int left = 0;
        char[] list = s.toCharArray();
        int right = list.length-1;
        while (left<right && list[left] == list[right]){
            left++;
            right--;
        }
        if (left>=right){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(a.validPalindrome("ececabbacec"));
    }
}
