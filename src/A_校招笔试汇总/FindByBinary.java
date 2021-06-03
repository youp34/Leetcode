package A_校招笔试汇总;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/4/13 11:14
 */
public class FindByBinary {

    public static void main(String[] args) {
        Integer[] nums = {2,3,4,5,6,7,7,8,9};
        int list = findBinary1(nums, 2);
        System.out.println(list);
    }
    private static int findBinary1(Integer[] nums,  int searchKey) {
        int l  = 0;
        int r = nums.length;
        int mid;
        while (l != r){
            mid = l + (r-l)/2;
            if (nums[mid] >=  searchKey){
                r = mid;
            }else{
                l = mid+1;
            }
        }
        return l;
    }













    private   static List<Integer> findBinary(Integer[] nums,  int searchKey) {
        List<Integer> myRes = new ArrayList<Integer>();
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid].equals(searchKey)) {
                if (mid > 0) {
                    if (nums[mid - 1].equals(searchKey)) {
                        for (int i = mid - 1; i >= 0; i--) {
                            if (nums[i].equals(searchKey)) {
                                myRes.add(i);
                            } else break;
                        }
                    }
                }
                myRes.add(searchKey);
                if (mid < high) {
                    if (nums[mid + 1].equals(searchKey)) {
                        for (int i = mid + 1; i <= high; i++) {
                            if (nums[i].equals(searchKey)) {
                                myRes.add(i);
                            } else break;
                        }
                    }
                }
                return myRes;
            } else if (searchKey < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return myRes;
    }
}
