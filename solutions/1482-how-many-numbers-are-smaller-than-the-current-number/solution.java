class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[]=new int[nums.length];
        for(int x=0;x<nums.length;x++)
        {
            int count=0;
            for(int y=0;y<nums.length;y++)
            {
                if(x!=y&&nums[x]>nums[y])
                {
                    count++;
                }
            }
            ans[x]=count;
        }
        return ans;
    }
}
