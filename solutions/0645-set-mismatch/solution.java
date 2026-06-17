class Solution {
    public int[] findErrorNums(int[] nums) {
        int x=0;
        int arr[]=new int[2];
        sort(nums);
        while(x<nums.length)
        {
            if(nums[x]==x+1)
            {
                x=x+1;
            }
            else
            {
                arr[0]=nums[x];
                arr[1]=x+1;
                break;
            }
        }
        return arr;
    }
    // public void sort(int nums[])
    // {
    //     for(int x=0;x<nums.length;x++)
    //     {
    //         if(nums[x]!=x+1)
    //         {
    //             int temp=nums[x];
    //             nums[x]=nums[temp-1];
    //             nums[temp-1]=temp;
    //         }
    //     }
    // }
    public void sort(int[] nums)
{
    int x = 0;

    while(x < nums.length)
    {
        int correct = nums[x] - 1;

        if(nums[x] != nums[correct])
        {
            int temp = nums[x];
            nums[x] = nums[correct];
            nums[correct] = temp;
        }
        else
        {
            x++;
        }
    }
}
}
