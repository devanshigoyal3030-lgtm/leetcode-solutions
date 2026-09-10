class Solution {
    public long countCommas(long n) {
        long res=0;
        long curr=1000;
        while(curr<=n){
            res+=n-curr+1;
            curr*=1000;
        }
        return res;
        
    }
}