class Solution {
    public int smallestEqual(int[] nums) {
        for(int x=0;x<nums.length;x++)
        if(x%10==nums[x])
        {
            return x;
        }
        return -1;
    }
}