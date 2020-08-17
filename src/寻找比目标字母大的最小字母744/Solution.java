package 寻找比目标字母大的最小字母744;

public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = -1;
        int r = letters.length;
        int mid;
        while (l+1 != r){
            mid = (l+r) /2;
            System.out.println(l + "===" + mid + "====" + r);
            if (letters[mid] > target) r = mid;
            else l = mid;
        }
        if (r == letters.length) return letters[0];
        return letters[r];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] a = {'e', 'e','e', 'e','e', 'e', 'f', 'f', 'f', 'f'};
        char[] b = {'c','f','j'};
        System.out.println(solution.nextGreatestLetter(a, 'a'));
    }
}
