class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;int maxcount=0;
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]==1)
            {
                count++;
            }
            else 
            {
                if(count>maxcount)
                {
                    maxcount=count;
                }
                count=0;
            }
        }
        if(count>maxcount)
        {
            return count;
        }
        return maxcount;
    }
}
