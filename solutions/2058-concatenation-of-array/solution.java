class Solution {
    public int[] getConcatenation(int[] nums) {
        int l=nums.length;
        int ans[]=new int[2*l];
        for(int x=0;x<l;x++)
        {
            ans[x]=nums[x];
            ans[x+l]=nums[x];
        }
        return ans;
    }
}
