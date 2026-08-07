class Solution {
    public int smallestNumber(int n, int t) {
        int x=n;
        int prod=0;
        while(x<=(((x/10)+1)*10))
        {
            if(x%10==0)
            {
                 prod=(x/10)*(x%10);
                if(prod%t==0)
                {
                   return x;
                }
                x++;

            }
            if(x<10)
            {
                if(x%t==0)
                {
                    return x;
                }
                x++;
            }
            else if(x<100&&x>10)
            { 
                prod=(x/10)*(x%10);
                if(prod%t==0)
                {
                   return x;
                }
                x++;

            }
        }
        return x;
    }
}