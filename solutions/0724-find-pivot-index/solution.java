class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int ls=0;
        int rs=0;
        for(int x=0;x<nums.length;x++)
        {
            sum+=nums[x];
        }
         for(int x=0;x<nums.length;x++)
        {
            
            rs=sum-nums[x]-ls;
            if(ls==rs)
            {
                return x;
            }
            ls+=nums[x];
        }
        return-1;
    }
}
