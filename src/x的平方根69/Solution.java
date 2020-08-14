package x的平方根69;

public class Solution {
    public int mySqrt(int x) {
        int temp = x/2;
        while (true){
            if (temp*temp > x) temp = temp/2;
            else temp = (temp+x)/2;
        }
        return ;
    }
}
