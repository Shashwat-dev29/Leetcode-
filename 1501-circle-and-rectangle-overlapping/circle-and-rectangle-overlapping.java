class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int px=Math.max(Math.min(x1,x2),Math.min(xCenter,Math.max(x1,x2)));
        int py=Math.max(Math.min(y1,y2),Math.min(yCenter,Math.max(y1,y2)));
        if((Math.pow((xCenter-px),2))+(Math.pow((yCenter-py),2))<=Math.pow(radius,2))
        {
            return true;
        }
        return false;
    }
}