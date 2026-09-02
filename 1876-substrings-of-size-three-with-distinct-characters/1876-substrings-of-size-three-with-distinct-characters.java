class Solution {
    public int countGoodSubstrings(String s) {
        Set<Character> set=new HashSet<>();
        int left=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            if(set.size()==3){
                c++;
                set.remove(s.charAt(left));
                left++;
            }
        }
        return c;
        
    }
}