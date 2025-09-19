class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
  for(int x=0;x<nums.length;x++)
  {
    if(nums[x]>9&&nums[x]<100)
    {
        count++;
    }
    else if(nums[x]>999&&nums[x]<10000)
    {
        count++;
    }
    else if(nums[x]>99999&&nums[x]<1000000)
    {
        count++;
    }
  }
    return count;    
    }
}
