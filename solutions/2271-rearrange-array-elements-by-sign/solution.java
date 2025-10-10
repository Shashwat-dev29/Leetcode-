class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[]=new int[nums.length];
        int pos=0;
        int neg=1;
        for(int x=0;x<nums.length;x++)
        {
          if(nums[x]>=0)
          {
            ans[pos]=nums[x];
            pos+=2;
          }
          else if(nums[x]<0)
          {
            ans[neg]=nums[x];
            neg+=2;
          }
        }
        return ans;
    }
}
