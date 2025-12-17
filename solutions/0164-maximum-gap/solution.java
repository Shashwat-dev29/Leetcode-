class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2)
        {
        return 0;
        }
        int max=Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int x=0;x<nums.length-1;x++)
        {
            if(nums[x+1]-nums[x]>max)
            {
                max=nums[x+1]-nums[x];
            }
        }
        return max;
    }
}
