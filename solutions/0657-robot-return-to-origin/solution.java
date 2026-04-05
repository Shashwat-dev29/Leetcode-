class Solution {
    public boolean judgeCircle(String moves) {
        int l=0;int r=0;
        int u=0;int d=0;
        for(int x=0;x<moves.length();x++)
        {
            if(moves.charAt(x)=='L')
            {
                l++;
            }
             else if(moves.charAt(x)=='R')
            {
                r++;
            }
             else if(moves.charAt(x)=='U')
            {
                u++;
            }
            else
            {
                d++;
            }
        }
        if(l==r&&u==d)
        {
            return true;
        }
        return false;
    }
}
