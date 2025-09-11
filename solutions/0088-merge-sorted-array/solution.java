class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      
       int mer[]=new int[m+n];
       int a=0;
      int x=0;
       for(int y=m;y<nums1.length;y++) 
       {
        if(nums2[x]!=0)
        {
        nums1[y]=nums2[x];
        }
        x++;
       }
       for(int c=0;c<nums1.length-1;c++)
       {
        for(int y=0;y<nums1.length-1-c;y++)
        {
            if(nums1[y]>nums1[y+1])
            {
                int temp=nums1[y];
                nums1[y]=nums1[y+1];
                nums1[y+1]=temp;
            }
        }
       }
    }
}
