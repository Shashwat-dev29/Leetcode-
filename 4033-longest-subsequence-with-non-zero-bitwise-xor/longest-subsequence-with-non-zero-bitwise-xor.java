class Solution {
    int maxlen=0;
    
    public int longestSubsequence(int[] nums) {
        // subsequence(nums,0,0,0);
        // return maxlen;
        boolean flag= false;
        int xor=0;
        for(int x=0;x<nums.length;x++)
        {
            xor=xor^nums[x];
            if(nums[x]!=0)
            {
                flag=true;
            }
        }
        if(xor!=0)
        {
            return nums.length;
        }
        else if(flag==true)
        {
            return nums.length-1;
        }
        return 0;
    }
    // private void subsequence(int nums[],int xor,int len,int t)
    // {
    //     if(t==nums.length)
    //     {
    //          if(xor!=0 && len>maxlen)
    //     {
    //      maxlen=len;
       
    //     }
    //         return;
    //     }
       
    //    subsequence(nums,xor^nums[t],len+1,t+1);
    //    subsequence(nums,xor,len,t+1);
    // }
}