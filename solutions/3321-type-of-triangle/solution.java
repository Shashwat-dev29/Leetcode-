class Solution {
    public String triangleType(int[] nums) {
        String str="";
        if(nums [0]==nums[1]&&nums[1]==nums[2])
        {
           str="equilateral";
        }
        else if((nums [0]==nums[1]||nums[1]==nums[2]||nums[0]==nums[2])&&(nums[0]+nums[1]>nums[2]&&nums[0]+nums[2]>nums[1]&&nums[2]+nums[1]>nums[0]))
        {
            str="isosceles";
        }
        else if(nums[0]+nums[1]>nums[2]&&nums[0]+nums[2]>nums[1]&&nums[2]+nums[1]>nums[0])
        {
            str="scalene";
        }
        else
        {
          str="none";
        }
        return str;
    }
}
