class Solution {
    public int countCommas(int n) {
        //return Math.max(n-999,0);
        int temp=n;
        int d=0;
        while(n!=0){
            n=n/10;
            d++;
        }
        if(d<4){
            return 0;
        }
        return temp-999;
    }
}