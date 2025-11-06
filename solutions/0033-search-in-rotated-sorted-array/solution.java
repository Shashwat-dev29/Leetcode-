class Solution {
    public int search(int[] nums, int target) {
        Solution obj=new Solution ();
        int pivot=obj.findpeak(nums);
        int start =0;
        if(pivot==-1)
        {
         return obj.binarysearch(nums,target,0,nums.length-1);
        }
        else if(nums[pivot]==target)
        {
           return pivot; 
        }
        else if(nums[start]<=target)
        {
           return obj.binarysearch(nums,target,0,pivot-1) ;
        }
        else if(nums[start]>target)
        {
            return obj.binarysearch(nums,target,pivot+1,nums.length-1) ;
        }

       return-1;
    }
    public int binarysearch(int[]nums,int target,int start,int end)
    {
        while(start<=end)
          {
            int mid=start+(end-start)/2;
            if(target==nums[mid])
            {
                return mid;
            }
            else if(target>nums[mid])
            {
                start=mid+1;
            }
             else if(target<nums[mid])
            {
                end=mid-1;
            }
          }
          return-1; 
    }
    public int findpeak(int[] n)
    {
       int first=0;
       int las=n.length-1;
       while(first<=las)
       {
      int  mid=first+(las-first)/2;
        if(mid<las && n[mid]>n[mid+1])
        {
            return mid;
        }
        else if(mid>first && n[mid]<n[mid-1])
        {
            return mid-1;
        }
        else if(n[first]>n[mid])
        {
            las=mid-1;
        }
        else
        {
           first=mid+1;
        }
       }
       return-1;
    }
}
