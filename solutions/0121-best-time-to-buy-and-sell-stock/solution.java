class Solution {
    public int maxProfit(int[] prices) {
       int maxprofit=0;
       int minpri=Integer.MAX_VALUE;
        for(int x=0;x<prices.length;x++)
        {
           if(prices[x]<minpri)
           {
            minpri=prices[x];
           }
           else if((prices[x]-minpri)>maxprofit)
           {
             maxprofit=prices[x]-minpri;
           }
        }
        return maxprofit;
        
    }
}
