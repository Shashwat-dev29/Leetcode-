class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>list=new ArrayList<>();
        sort(nums);
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]!=x+1)
            {
                list.add(x+1);
            }
        }
        return list;
    }
    
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

