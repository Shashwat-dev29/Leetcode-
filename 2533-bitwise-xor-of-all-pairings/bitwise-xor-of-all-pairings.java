class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor=0;
        if(nums2.length%2!=0)
        {
        for(int x=0;x<nums1.length;x++)
        {
            xor^=nums1[x];
        }
        }
        if(nums1.length%2!=0)
        {
        for(int x=0;x<nums2.length;x++)
        {
            xor^=nums2[x];
        }
        }
        return xor;
    }
}