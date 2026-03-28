class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        
        int count=0;
        for(int x=0;x<nums.length;x++)
        {
            if((nums[x]&1)==0)
            {
                count++;
            }
            if(count==2)
            {
                return true;
            }
        }
        return false;
    }
}
