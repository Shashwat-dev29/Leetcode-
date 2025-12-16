class Solution {
    public long getDescentPeriods(int[] prices) {
        long smooth=0;
        long count=1;
        if(prices.length==1)
        {
            return 1;
        }
        for(int x=1;x<prices.length;x++)
        {
            if(prices[x-1]-prices[x]==1)
            {
                count++;
            }
            else
            {
                smooth+=(count*(count+1))/2;
                count=1;
            }
            if(x==prices.length-1)
            {
               smooth+=(count*(count+1))/2;
            }
        }
        return smooth;
    }
}
