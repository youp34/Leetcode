package 两数之和II输入有序数组167;

class Demo {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers == null){
            return null;
        }
        int i = 0;
        int j = numbers.length-1;
        int sum = numbers[i]+numbers[j];
        while(sum != target){
            if(sum < target){
                i++;
            }else{
                j--;
            }
            sum = numbers[i]+numbers[j];
        }
        int[] list = {i+1,j+1};
        return list;
    }
}
