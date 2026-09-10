class Solution {
    public long countCommas(long n) {
        // if(n<1000)
        // {
        //     return 0;
        // }
        // if(n>1000000)
        // {
        //     return (n-1000000+1)+(n-1000+1);
        // }
        long m=1000;
        int x=3;
        long sum=0;
        while(n>=m)
        {
            sum+=(n-m+1);
            x=x+3;
            m=(long)Math.pow(10,x);
        }
        return sum;
    }
}