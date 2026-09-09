class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int arr[]=new int[n];
    int l=0, r=0;
    if(k==0){
        return arr;
    }
       if(k>0){
             l=1;
            r=k;
        }
        else if(k<0){
            l=n+k;
            r=n-1;
        }
        int sum=0;
        for(int i=l;i<=r;i++){
            sum+=code[i];
        }
        for(int j=0;j<n;j++){
            arr[j]=sum;
            sum-=code[l];
            l=(l+1)%n;
            r=(r+1)%n;
            sum+=code[r];
        }
        return arr;
    }
}