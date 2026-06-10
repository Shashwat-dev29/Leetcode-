class Solution {
    public int thirdMax(int[] nums) {
       long lar = Long.MIN_VALUE;
long la = Long.MIN_VALUE;
long l = Long.MIN_VALUE;
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]>lar)
            {
                l=la;
                la=lar;
                lar=nums[x];
            }
            else if (nums[x] > la && nums[x] !=lar) {
                l = la;
                la = nums[x];
            } else if (nums[x] > l && nums[x] != lar && nums[x] != la) {
                l = nums[x];
            }
        }
        
        if (nums.length<3 || l==Long.MIN_VALUE)
        {
            return (int)lar;
        }
        return (int) l;
    }
}
