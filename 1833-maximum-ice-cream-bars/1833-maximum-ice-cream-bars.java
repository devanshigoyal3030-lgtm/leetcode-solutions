class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;
        int total=0;
        for(int i=0;i<costs.length;i++){
            total+=costs[i];
            if(total<=coins){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }}


