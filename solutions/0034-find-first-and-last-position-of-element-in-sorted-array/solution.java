class Solution {
    public int[] searchRange(int[] nums, int target) {
        int y=-1;
        int res[]=new int[2];
       res[0]=-1;
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]==target&&y==-1)
            {
                res[0]=x;
                y=x;
            }
            else if(nums[x]==target)
            {
                y=x;
            }
        }
        res[1]=y;
        return res;
    }
}
