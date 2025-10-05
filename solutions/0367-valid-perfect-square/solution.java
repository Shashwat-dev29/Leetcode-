class Solution {
    public boolean isPerfectSquare(int num) {
       long las=num;
       long fir=1;
      
       while(fir<=las)
       {
        long mid= fir+(las-fir)/2;
        long sq=mid*mid;
       if(sq==num)
       {
        return true;
       }
       else if(sq<num)
       {
        fir=mid+1;
       }
       else if(sq>num)
       {
        las=mid-1;
       }
       }
       return false;
    }
}
