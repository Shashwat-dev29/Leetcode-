class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
       
        Arrays.sort(nums);
        for(int x=0;x<nums.length;x++)
        {
            if (x > 0 && nums[x] == nums[x - 1])
                continue;
            
            int a=x+1;
            int b=nums.length-1;
            while(a<b)
            {
                if(nums[x]+nums[a]+nums[b]==0)
                {
                     List<Integer> row = new ArrayList<>();
                    row.add(nums[x]);
                    row.add(nums[a]);
                    row.add(nums[b]);
                     while (a < b && nums[a] == nums[a + 1]) a++;
                    while (a < b && nums[b] == nums[b - 1]) b--;
                    a++;
                    b--;
                    list.add(row);
                }
                else if((nums[a]+nums[b]+nums[x])>0)
                {
                    b=b-1;
                }
                else
                {
                    a=a+1;
                }
            }
             
        }
        return list;
    }
}
