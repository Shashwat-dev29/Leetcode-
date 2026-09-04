class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int mini[]=new int[nums.length];
        int ans[]=new int[nums.length];
        int max=nums[0];
        int min=nums[nums.length-1];
        for(int y=nums.length-1;y>=0;y--)
        {
            min=Math.min(nums[y],min);
            mini[y]=min;
        }
      for(int x=0;x<nums.length;x++)
      {
        max=Math.max(max,nums[x]);
        ans[x]=max-mini[x];
        if(ans[x]<=k)
        {
            return x;
        }
      } 
      return -1; 
    }
}