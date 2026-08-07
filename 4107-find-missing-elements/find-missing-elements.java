class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=1;
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]<min)
            {
                min=nums[x];
            }
            if(nums[x]>max)
            {
                max=nums[x];
            }
        }
       ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>ans=new ArrayList<>();
       for(int x=0;x<nums.length;x++)
       {
        list.add(nums[x]);
       }
       for(int a=min;a<max;a++)
       {
        if(!list.contains(a))
        {
            ans.add(a);
        }
       }
       return ans;
    }
}