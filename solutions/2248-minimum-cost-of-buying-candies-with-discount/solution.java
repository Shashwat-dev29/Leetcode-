class Solution {
    public int minimumCost(int[] cost) {
        int output=0;
        Arrays.sort(cost);
        if (cost.length<=2)
        {
            for(int x=0;x<cost.length;x++)
            {
                output+=cost[x];
            }
            return output;
        }
        int max= 2;
        int count=0;
        
        for(int x=cost.length-1;x>=0;x--)
        {
           
          if(count<max)
          {
            output+=cost[x];
            count++;
          }
            else
            {
                count=0;
            }
        }
        return output;
    }
}
