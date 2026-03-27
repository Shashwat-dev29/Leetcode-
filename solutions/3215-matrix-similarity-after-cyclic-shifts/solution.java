class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int len=mat[0].length;
        int eshift=k%len;
        for(int x=0;x<mat.length;x++)
        {
            for (int y=0;y<len;y++)
            {
               if(mat[x][y]!=mat[x][(y+eshift)%mat[0].length])
              {
                 return false;
              }
            }
        }
       return true;
    }
}
