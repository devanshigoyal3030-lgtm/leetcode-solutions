class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int right=numbers.length-1;
        while(l<right){
                if(numbers[l]+numbers[right]==target){
                return new int[]{l+1,right+1};
            }
            else if(numbers[l]+numbers[right]>target){
                right--;
            }
            else{
                l++;
            }
        }
        return new int[]{};
        
    }
}