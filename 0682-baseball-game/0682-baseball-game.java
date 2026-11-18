class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st =new Stack<>();
        for(int i=0;i<op.length;i++){
            if(op[i].equals("+")){      //string array isliye double quotes 
                                        // character array single m hota hai
                int top=st.pop();
                int newscore=top+st.peek();
                st.push(top);
                st.push(newscore);
            }
            else if(op[i].equals("D")){
                st.push(2*st.peek());
                
            }
            else if(op[i].equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(op[i]));

            }
        }
        int sum=0;
        for(int s:st){
            sum+=s;
        }

        return sum;
    }
}