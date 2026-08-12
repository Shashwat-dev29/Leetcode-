class Solution {
    public int missingInteger(int[] nums) {
       
        int x=1;
        int sum=nums[0];
        while( x<nums.length  && nums[x]-nums[x-1]==1)
        {
            sum+=nums[x];
            x++;
        }
       
       HashSet<Integer> set=new HashSet<>();
       for(int a=0;a<nums.length;a++)
       {
        set.add(nums[a]);
       }
       while(set.contains(sum))
       {
        sum++;
       }
        return sum;
    }
}