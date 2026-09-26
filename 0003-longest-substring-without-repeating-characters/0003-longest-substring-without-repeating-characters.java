class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        int k=s.length();
        for(int i=0;i<k;i++){
            Set<Character> set=new HashSet<>();
            for(int j=i;j<k;j++){
                if(set.contains(s.charAt(j))){
                    break;
                }
            set.add(s.charAt(j));
            }
             ans=Math.max(ans,set.size());
        }
        return ans;
       
        
    }
}