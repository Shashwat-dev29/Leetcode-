// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
        
//         for(int x=0;x<nums.length;x++)
//         {
//             int c=1;
//             while(c<=k&&(x+c)<nums.length)
//             {
//                 if(nums[x]==nums[x+c])
//                 {
//                     return true;
//                 }
//                 c++;
//             }
//         }
//         return false;
//     }
// }
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet window=new HashSet<>();
        for(int x=0;x<nums.length;x++)
        {
            if(x>k)
            {
                window.remove(nums[x-k-1]);
            }
            if(!window.add(nums[x]))
            {
                return true;
            }
        }
        return false;
    }
}