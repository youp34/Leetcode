package 平方数之和633;

public class Demo {
    public boolean judgeSquareSum(int c) {
        int i = 0;
        double k = Math.sqrt((double)c);
        int j = (int)k;
        int target;
        while(i <= j){
            target = i*i + j*j;
            if(target == c){
                return true;
            }else if(target < c){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}
