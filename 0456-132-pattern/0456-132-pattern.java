class Solution {
    public boolean find132pattern(int[] nums){
Stack<Integer> st = new Stack();
int sm = Integer.MIN_VALUE;
for(int i = nums.length-1;i>=0;i--){
    if(nums[i]<sm){
        return true;
    }
    while(!st.isEmpty() && nums[i]>st.peek()){
sm = Math.max(sm,st.pop());
    }
    //All the peeks..
    st.push(nums[i]);
}
return false;
    }
}