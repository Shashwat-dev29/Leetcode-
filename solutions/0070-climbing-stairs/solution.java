class Solution {
    public int climbStairs(int n) {
        int ser[]=new int[n+1];
        ser[0]=1;
        ser[1]=1;
        
        for(int x=2;x<=n;x++)
        {
            ser[x]=ser[x-2]+ser[x-1];
            
        }
        return(ser[n]);
}
}
