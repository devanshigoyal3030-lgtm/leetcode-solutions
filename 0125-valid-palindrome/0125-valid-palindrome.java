class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        String rev=new StringBuffer(s).reverse().toString();
        if(s.equals(rev)){
            return true;
        }
        else{
            return false;
        }
        //return s.equals(rev);
        
    }
}