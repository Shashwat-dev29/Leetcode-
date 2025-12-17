class Solution {
    public int trailingZeroes(int n) {
        int a=0;
        for(int x=1;x<6;x++)
        {
          a+=n/Math.pow(5,x);
        }

       return a ;
        
       
    }
}
