class Solution {
    public long sumAndMultiply(int n) {
        long x=0;
        long sum=0;
        int c=0;
        while(n>0)
        {
          int g=n%10;
          if(g>0)
          {
          x= (long)(g*Math.pow(10,c))+x;
          c++;
          }
          n=n/10;
          sum+=g;
        }
        return x*sum;
    }
}
