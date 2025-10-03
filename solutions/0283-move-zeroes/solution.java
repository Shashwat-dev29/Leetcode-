class Solution {
    public void moveZeroes(int[] nums) {
        int fir=0;int las=0;
        while(las!=nums.length)
        {
        if(nums[las]!=0)
        {
             int temp=nums[fir];
            nums [fir]=nums[las];
            nums[las]=temp;
            fir++;
            las++;
        }
        else
        {
            las++;
        } 
    }

    }
}
