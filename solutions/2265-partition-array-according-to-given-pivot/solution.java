class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
      int e=0;
      int s=0;
      int l=0;
      int ans[]=new int[nums.length];
      for(int x=0;x<nums.length;x++)
      {
        if(nums[x]<pivot)
        {
            s++;
        }
        // else if(nums[x]>pivot)
        // {
        //     l++;
        // }
        else if(nums[x]==pivot)
        {
            e++;
        }
      }
      int li=s+e;
      int si=0;
      for(int x=0;x<nums.length;x++)
      {
        if(nums[x]==pivot)
        {
          ans[s]=nums[x];
          s++;
        }
        else if(nums[x]>pivot)
        {
            ans[li]=nums[x];
            li++;
        }
        else
        {
        ans[si]=nums[x];
        si++;
        }
      }
     return ans;
    }
}
