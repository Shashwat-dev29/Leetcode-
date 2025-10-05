class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int a=numBottles;
        int count=0;
        if(numExchange==1)
        {
            return Integer.MAX_VALUE;
        }
        while(numBottles>=numExchange)
        {
           count+=numBottles/numExchange;
           numBottles=(numBottles%numExchange)+(numBottles/numExchange);
        }
       return count+a; 
    }
}
