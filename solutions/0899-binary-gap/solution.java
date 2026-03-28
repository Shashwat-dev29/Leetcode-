class Solution {
    public int binaryGap(int n) {
        int c=0;
        int d=0;
        while(n>0)
        {
            if((n&1)==1)
            { 
                if(c!=0)
                {
               if(d<c)
               {
                 d=c;
               }
                }
                c=1;
            }
           
            else if((n&1)==0&&c!=0)
            {
                c++;
            }
            n >>= 1;

        }
        return d;
    }
}
