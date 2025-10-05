class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
       
        int a=numBottles;
        int count=0;
        while(numBottles>=numExchange)
        {
           count+=1;
           numBottles=(numBottles-numExchange)+1;
           numExchange+=1;
        }
       return count+a; 
    }
}
    
