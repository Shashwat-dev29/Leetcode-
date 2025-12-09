class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
       int x=0;
       int y= 1;
      
       while(y<=nums.length-1)
       {
        if(nums[x]!=nums[y])
        {
            x++;
            nums[x]=nums[y];
            y++;
            count++;
        }
        else
        {
            y++;
        }
       }
return count+1;
    }
}
