class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxd=Math.abs(nums[0]-nums[nums.length-1]);
        for(int x=0;x<nums.length-1;x++)
        {
            if(maxd<Math.abs(nums[x]-nums[x+1]))
            {
                maxd=Math.abs(nums[x]-nums[x+1]);
            }
        }
       
        return maxd;
    }
}
