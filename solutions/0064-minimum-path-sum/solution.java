// class Solution {
//     ArrayList<Integer> list= new ArrayList<>();
//     public int minPathSum(int[][] grid) {
//         maze(grid,0,0,0);
//         int min=Integer.MAX_VALUE;
//        for(int x=0;x<list.size();x++)
//        {
//         if(list.get(x)<min)
//         {
//             min=list.get(x);
//         }
//        }
//        return min;
//     }
    
//     public void maze(int grid[][],int x,int y,int a)
//     {
//           if (x >= grid.length || y >= grid[0].length)
//             return;
//       if(x==grid.length-1 && y== grid[0].length-1)
//       {
//        list.add (a+grid[x][y]);
//        return;
        
//       }
//        a+=grid[x][y];
//      maze(grid,x+1,y,a);
//      maze(grid,x,y+1,a);
      
//     }
// }


class Solution {
    Integer[][] dp;

    public int minPathSum(int[][] grid) {
        dp = new Integer[grid.length][grid[0].length];
        return maze(grid, 0, 0);
    }

    public int maze(int[][] grid, int x, int y) {
        if (x >= grid.length || y >= grid[0].length)
            return Integer.MAX_VALUE;

        if (x == grid.length - 1 && y == grid[0].length - 1)
            return grid[x][y];

        if (dp[x][y] != null)
            return dp[x][y];

        int down = maze(grid, x + 1, y);
        int right = maze(grid, x, y + 1);

        return dp[x][y] = grid[x][y] + Math.min(down, right);
    }
}

