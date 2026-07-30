class Solution {
    public int maxProduct(int[] nums) {
        int max1=1;
        int max2=0;
        for(int x=0;x<nums.length;x++)
        {
            // for(int y=0;y<nums.length;y++)
            // {
            //     if(x!=y)
            //     {
            //     prod=(nums[x]-1)*(nums[y]-1);
            //     if(prod>mp)
            //     {
            //         mp=prod;
            //     }
            //     }
            if(nums[x]>=max1)
            {
                max2=max1;
                max1=nums[x];
            }
            else if (nums[x] > max2)
                max2 = nums[x];
            
        }
        return (max1-1)*(max2-1);
    }
}