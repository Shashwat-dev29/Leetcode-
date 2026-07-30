class Solution {
    public int maxProduct(int[] nums) {
        int prod=1;
        int mp=0;
        for(int x=0;x<nums.length;x++)
        {
            for(int y=0;y<nums.length;y++)
            {
                if(x!=y)
                {
                prod=(nums[x]-1)*(nums[y]-1);
                if(prod>mp)
                {
                    mp=prod;
                }
                }
            }
        }
        return mp;
    }
}