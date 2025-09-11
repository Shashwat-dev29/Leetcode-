class Solution {
    public boolean search(int[] nums, int target) {
       
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]==target)
            {
                return true;
            }
        }
        return false;
        
    }
}
