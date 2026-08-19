class Solution {
    public void rotate(int[] nums, int k) {
        int a=0;
        
        if(k>nums.length)
        {
            k=k%nums.length;
        }
        int b=k;
        ArrayList<Integer>list=new ArrayList<>();
        for(int x=0;x<nums.length-k;x++)
        {
            list.add(nums[x]);
        }
      for(int x=0;x<k;x++)
      {
        nums[x]=nums[nums.length-b];
        b--;
      }
      for(int x=k;x<nums.length;x++)
      {
        nums[x]=list.get(a);
        a++;
      }
        
    
    }
}