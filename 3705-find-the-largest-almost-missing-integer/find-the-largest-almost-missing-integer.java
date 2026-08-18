class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        boolean m1=false;
        boolean m2=false;
        int max=Integer.MIN_VALUE;
        for(int x=0;x<nums.length;x++)
        {
            map.put(nums[x],map.getOrDefault(nums[x],0)+1);
        }
        if(k==nums.length)
        {
          for(int x=0;x<nums.length;x++)
          {
            if(nums[x]>max)
            {
                max= nums[x];
            }
          }
          return max;
        }
            else if(k==1)
            {
                for(int x=0 ;x<nums.length;x++)
                {
                    if (map.get(nums[x]) == 1 && nums[x] > max) {
                    max = nums[x];
                }
                }
               return max == Integer.MIN_VALUE ? -1 : max;
            }
            else
            {
                if(map.get(nums[0])==1)
                {
                    m1=true;
                }
                if(map.get(nums[nums.length-1])==1)
                {
                    m2=true;
                }
                if(m1==true&&m2==true)
                {
                    return Math.max(nums[0],nums[nums.length-1]);
                }
                else if(m1==true&&m2==false)
                {
                    return nums[0];
                }
                else if(m1==false&&m2==true)
                {
                    return nums[nums.length-1];
                }
            }
          
        
        return -1;
    }
}



// import java.util.HashMap;

// class Solution {
//     public int largestInteger(int[] nums, int k) {
//         int n = nums.length;
        
//         // 1. Count the total frequency of each number
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int x = 0; x < n; x++) {
//             map.put(nums[x], map.getOrDefault(nums[x], 0) + 1);
//         }
        
//         // 2. Case 1: k equals the whole array length
//         if (k == n) {
//             int max = -1;
//             for (int x = 0; x < n; x++) {
//                 if (nums[x] > max) {
//                     max = nums[x];
//                 }
//             }
//             return max;
//         }
        
//         // 3. Case 2: k equals 1 (look for unique numbers across the whole array)
//         if (k == 1) {
//             int max = -1;
//             for (int x = 0; x < n; x++) {
//                 if (map.get(nums[x]) == 1 && nums[x] > max) {
//                     max = nums[x];
//                 }
//             }
//             return max;
//         }
        
//         // 4. Case 3: 1 < k < n (only the first and last elements can work)
//         int max = -1;
//         if (map.get(nums[0]) == 1) {
//             max = Math.max(max, nums[0]);
//         }
//         if (map.get(nums[n - 1]) == 1) {
//             max = Math.max(max, nums[n - 1]);
//         }
        
//         return max;
//     }
// }
