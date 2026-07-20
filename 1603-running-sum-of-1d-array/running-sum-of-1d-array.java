class Solution {
    public int[] runningSum(int[] nums) {
        int ans[]=new int[nums.length];
       int sum=0;
       for(int x=0;x<nums.length;x++)
       {
        sum+=nums[x];
        ans[x]=sum;
       } 
       return ans;
    }
}