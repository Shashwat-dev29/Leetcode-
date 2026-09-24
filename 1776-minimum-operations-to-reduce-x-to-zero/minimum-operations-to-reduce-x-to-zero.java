class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=0;
        int dif=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        dif=sum-x;
        if(dif == 0)
{
    return nums.length;
}
        int i=0;
        int j=1;
        sum=nums[i];
        int max=-1;
        int len=1;
        if(sum == dif)
{
    max = len;
}
        while(j<nums.length)
        {
           sum+=nums[j];
             len++;
              while(sum > dif && i < j)
            {
                sum = sum - nums[i];
                i++;
                len--;
            }

            if(sum == dif)
            {
                if(len > max)
                {
                    max = len;
                }
            }
        //    if(sum==dif)
        //    {
        //     if(len>max)
        //     {
        //         max=len;
        //     }
        //     sum=sum-nums[i];
        //     i++;
        //     len--;
        //    }
        //    if(sum>dif)
        //    {
        //     sum=sum-nums[i];
        //     i++;
        //     len--;
        //    }
           j++;
         
        }
        if(max==-1)
        {
            return -1;
        }
        return nums.length-max;
    }
}