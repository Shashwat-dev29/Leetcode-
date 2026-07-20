class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumeven=0;
        int sumodd=0;
        
      for(int x=1;x<=2*n;x++)
      {
        if(x%2==0)
        {
            sumeven+=x;
        }
        else
        {
            sumodd+=x;
        }
      }  
      return gcd(sumeven,sumodd);
    }
    public int gcd(int e,int o)
    {
        int x=1;
        int gcd=0;
        if(e%o==0)
        {
            return o;
        }
        while(x<o)
        {
            if(o%x==0&&e%x==0)
            {
                gcd=x;
            }
            x++;
        }
        return gcd;
    }
}