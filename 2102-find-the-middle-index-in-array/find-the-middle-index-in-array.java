class Solution {
    public int findMiddleIndex(int[] nums) {
       int sum=0;
       for(int x=0;x<nums.length;x++)
       {
        sum+=nums[x];
       } 
       int su=0;
       for(int x=0;x<nums.length;x++)
       {
         if((sum-su-nums[x])==su)
         {
            return x;
         }
         su+=nums[x];
       }
       return -1;
    }
}