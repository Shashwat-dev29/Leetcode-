class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int x=0;x<nums.length;x++)
        {
            sum+=nums[x];
        }
        return sum%k;
    }
}
