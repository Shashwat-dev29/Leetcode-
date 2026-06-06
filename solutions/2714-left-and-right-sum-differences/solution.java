class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left[]=new int[nums.length];
        
        int tot=0;
         int sum=0;
         
         for(int x=nums.length-1;x>=0;x--)
         {
           tot+=nums[x];
         }
        //  for(int x=1;x<nums.length;x++)
        //  {

        //     sum+=nums[x-1];
        //     left[x]=sum;
        //  }
        //  for(int x=nums.length-2;x>=0;x--)
        //  {
        //    dif+=nums[x+1];
        //    right[x]=dif;
        //  }
        for(int x=0;x<left.length;x++)
        {
             int rightSum = tot - sum - nums[x];
            left[x]=Math.abs((sum-rightSum));
           sum+=nums[x];
        }
        return left;
    }
}
