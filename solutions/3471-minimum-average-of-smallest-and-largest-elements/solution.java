class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double ans=0;
      int a=0;
    double min=Double.MAX_VALUE;;
      
      int l=nums.length-1;
      for (int x=0;x<nums.length/2;x++)
      {
        ans=(double)(nums[a]+nums[l])/2;
         if(ans<min)
        {
            min=ans;
        }
        a++;
        l--;
      }
    
       return min;
    }
    
}
