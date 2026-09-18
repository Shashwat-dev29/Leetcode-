// class Solution {
//     public boolean checkSubarraySum(int[] nums, int k) {
//         int curr=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             curr+=nums[i];
//             if(curr%k==0)
//             {
//                 return true;
//             }
//             // if(curr>k)
//             // {
//             //  curr=0;
//             // }
        
//         }
//         return false;
//     }
// }


class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int curr = 0;

        for(int i = 0; i < nums.length; i++) {

            curr += nums[i];
            int rem = curr % k;

            if(map.containsKey(rem)) {
                if(i - map.get(rem) >= 2) {
                    return true;
                }
            }
            else {
                map.put(rem, i);
            }
        }

        return false;
    }
}