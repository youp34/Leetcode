package 牛客跳台阶;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/1/13 8:24
 *
 * 斐波那契 前身
 */
public class Solution {
    public int JumpFloor(int target) {
        if (target == 0){
            return 0;
        }
        if (target == 1){
            return 1;
        }
        return JumpFloor(target-1)+JumpFloor(target-2);
    }
}
