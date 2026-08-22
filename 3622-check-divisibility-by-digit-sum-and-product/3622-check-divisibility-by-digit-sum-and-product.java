class Solution {
    public boolean checkDivisibility(int n) {
        int org=n;
        int sum=0;
        int prod=1;
        while(n>0){
            int digit=n%10;
            sum=sum+digit;
            prod=prod*digit;
            n=n/10;
        }
        int p=sum+prod;
        if(org%p==0){
            return true;
        }
        else{
            return false;
        }
        
    }
}