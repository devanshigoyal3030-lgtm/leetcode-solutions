class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int cw=0;
        int ch=0;
        cw=Math.min(rec1[2],rec2[2])-Math.max(rec1[0],rec2[0]);
        ch=Math.min(rec1[3],rec2[3])-Math.max(rec1[1],rec2[1]);
        if(cw>0 && ch>0){
            return true;
        }
        else
        return false;
    }
}