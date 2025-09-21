class Solution {
    public int searchInsert(int[] nums, int target) {
        int g=0;
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]==target)
            {
               g=x;
               break;
            }
            else if(nums[x]>target)
            {
                g=x;
                break;
            }
            else
            {
                g=nums.length;
            }
           
            
        }
        return g;
    }
}
