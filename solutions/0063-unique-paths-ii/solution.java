class Solution {
    Integer dp[][];
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
         dp = new Integer[m][n];
       return path(0,0,obstacleGrid);
    }
    public int path(int r,int c,int[][] obstacleGrid)
    {
          if (r >= obstacleGrid.length || c >= obstacleGrid[0].length) {
            return 0;
        }
         if (obstacleGrid[r][c] == 1) {
        return 0;
         }
        if(r==obstacleGrid.length-1 && c==obstacleGrid[0].length-1)
        {
            return 1;
        }
        
         if (dp[r][c] != null) {
            return dp[r][c];
        }
        
          int d=path(r+1,c,obstacleGrid);
          int ri=path(r,c+1,obstacleGrid);
         dp[r][c] = d + ri;
        return dp[r][c];
    }
}
