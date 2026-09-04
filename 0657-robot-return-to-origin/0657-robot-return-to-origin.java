class Solution {
    public boolean judgeCircle(String moves) {
       // int ch=moves.charAt(i);
        int x=0;
        int y=0;
        for(int i=0;i<moves.length();i++){
            int ch=moves.charAt(i);

            if(ch=='U'){
                y++;
            }
            else if(ch=='D'){
                y--;
            }
            else if (ch=='R'){
                x++;
            }
            else if (ch=='L'){
                x--;
            }

        }
        return(x==0 && y==0);
        // if(x==0 && y==0){
        //     return true;
        // }
        // else
        // return false;

        }
}