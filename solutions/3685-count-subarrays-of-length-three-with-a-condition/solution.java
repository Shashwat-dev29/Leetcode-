class Solution {
    public int countSubarrays(int[] nums) {
        int count=0;
        for(int x=1;x<nums.length-1;x++)
        {
              
             if(((nums[x-1]+nums[x+1])*2)==nums[x])
             {
                count++;
             }
        }
        return count;
    }
}
