class Solution {
    public int smallestIndex(int[] nums) {
        int sum=0;
        for(int x=0;x<nums.length;x++)
        {
           
              int g=nums[x];
                while(g>0)
                {
                    sum+=g%10;
                    g=g/10;
                }
                if(sum==x)
                {
                    return x;
                }
                sum=0;
            
        }
        return -1;
    }
}