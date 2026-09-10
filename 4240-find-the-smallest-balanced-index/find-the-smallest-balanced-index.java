// class Solution {
//     public int smallestBalancedIndex(int[] nums) {
//         long totalSum=0;
//         for(int x=0;x<nums.length;x++)
//         {
//           totalSum+=nums[x];
//         }
//         long prod=1;
//         for(int x=nums.length-1;x>=0;x--)
//         {
//             if (prod > totalSum) {
//                 prod = totalSum + 1;
//             } else if (nums[x] != 0 && prod > totalSum / nums[x]) {
//                 prod = totalSum + 1;
//             } else {
//                 prod = prod * nums[x];
//             }
//         }
//         return -1;
//     }
// }

class Solution {
    public int smallestBalancedIndex(int[] nums) {

        long totalSum = 0;

        for (int x : nums) {
            totalSum += x;
        }

        long[] arr = new long[nums.length];

        long prod = 1;

        for (int x = nums.length - 1; x >= 0; x--) {
            arr[x] = prod;

            if (prod > totalSum || 
                (nums[x] != 0 && prod > totalSum / nums[x])) {
                prod = totalSum + 1;
            } else {
                prod = prod * nums[x];
            }
        }

        long sum = 0;

        for (int x = 0; x < nums.length; x++) {
            if (sum == arr[x]) {
                return x;
            }

            sum += nums[x];
        }

        return -1;
    }
}