class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int dsum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        while(nums[i]>0){
            int digit=nums[i]%10;
            dsum+=digit;
            nums[i]/=10;

        }}
        int difference=sum-dsum;
            return difference;
        
        
    }
}