class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlen=Integer.MAX_VALUE;
        int a=0;
        int b=0;
        int sum=0;
        while(b<nums.length)
        {
            sum+=nums[b];
           
            
            while(sum>=target )
            {
                minlen=Math.min(minlen,b-a+1);
                sum=sum-nums[a];
                a++;
                
            }
            b++;
            
        }
        if(minlen==Integer.MAX_VALUE )
        {
            return 0;
        }
        return minlen;
    }
}
