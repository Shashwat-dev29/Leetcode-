class Solution {
    public int findGCD(int[] nums) {
      int max=Integer.MIN_VALUE;
      int min=Integer.MAX_VALUE;
      for(int x=0;x<nums.length;x++)
      {
        if(nums[x]>max)
        {
            max=nums[x];
        }
        if(nums[x]<min)
        {
            min=nums[x];
        }
        
      }  
      return gcd(max,min);
    }
    public int gcd(int max,int min)
    {
        int x=1;
        int gcd=0;
        if(max%min==0)
        {
            return min;
        }
        while(x<min)
        {
            if(max%x==0&&min%x==0)
            {
                gcd=x;
            }
            x++;
        }
        return gcd;
    }
}