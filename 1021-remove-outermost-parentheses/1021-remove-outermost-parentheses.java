class Solution {
    public String removeOuterParentheses(String s) {
        
        Stack<Character> st=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(count>0){
                    st.push('(');
                }
                count++;
            }
            else{
                count--;
                if(count>0){
                    st.push(')');
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:st){
            sb.append(ch);
        }
        return sb.toString();
        
    }
}