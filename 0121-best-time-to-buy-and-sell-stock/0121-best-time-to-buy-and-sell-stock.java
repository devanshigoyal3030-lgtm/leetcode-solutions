class Solution {
    public int maxProfit(int[] prices) {
        // int max=0;
        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //     if(prices[i]<prices[j]){
        //     int k =prices[j]-prices[i];
        //         if(k>max){
        //             max=k;
        //         }
        //      }
        // }}
        // return max;
        // }}
        int minPrice = prices[0];
        int maxProfit = 0;
         for(int i = 1; i < prices.length; i++) {
             int profit = prices[i] - minPrice;
            if(profit > maxProfit) {
                maxProfit = profit;
            }
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }
        return maxProfit;
    }
}





