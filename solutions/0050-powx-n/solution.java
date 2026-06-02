class Solution {
    public double myPow(double x, long n) {
        if(n==0)
        {
            return 1;
        }
      else if(n<0)
      {
        double half;
        n=Math.abs(n);
         if(n%2==0){
         half= myPow(x,(n/2));
         return 1/( half*half);
      }
      else
      {
         half= myPow(x,((n-1)/2));
      }
      return 1/(x*half*half);
         

      }
      double half;
      if(n%2==0){
         half= myPow(x,(n/2));
         return half*half;
      }
      else
      {
         half= myPow(x,((n-1)/2));
      }
      return x*half*half;
    }
}
