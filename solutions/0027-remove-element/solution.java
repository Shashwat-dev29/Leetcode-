class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int z=0;z<nums.length;z++)
        {
            if(nums[z]!=val)
            {
                nums[count]=nums[z];
                count++;
            }
            
        }
        return count;
    }
}
