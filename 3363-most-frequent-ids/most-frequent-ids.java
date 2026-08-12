// class Solution {
//     public long[] mostFrequentIDs(int[] nums, int[] freq) {
//         HashMap<Integer,Long> map=new HashMap<>();
//         long ans[]=new long[nums.length];
//         long max=0;
//         for(int x=0;x<nums.length;x++)
//         {
//             map.put(nums[x], map.getOrDefault(nums[x], 0L) + freq[x]);
//             if(map.get(nums[x])>max)
//             {
//                 max=map.get(nums[x]);
//             }
//             ans[x]=max;
//         //    ans[x]=Collections.max(map.values());
//         }
//         return ans;
//     }
// }




class Solution {
    public long[] mostFrequentIDs(int[] nums, int[] freq) {

        // ID -> current frequency
        HashMap<Integer, Long> map = new HashMap<>();

        // frequency -> how many IDs have this frequency
        TreeMap<Long, Integer> tree = new TreeMap<>();

        long[] ans = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {

            long oldFreq = map.getOrDefault(nums[i], 0L);

            // remove old frequency from TreeMap
            if (oldFreq > 0) {
                tree.put(oldFreq, tree.get(oldFreq) - 1);

                if (tree.get(oldFreq) == 0) {
                    tree.remove(oldFreq);
                }
            }

            // update the frequency of the current ID
            long newFreq = oldFreq + freq[i];
            map.put(nums[i], newFreq);

            // add the new frequency
            if (newFreq > 0) {
                tree.put(newFreq, tree.getOrDefault(newFreq, 0) + 1);
            }

            // largest frequency currently present
            ans[i] = tree.isEmpty() ? 0 : tree.lastKey();
        }

        return ans;
    }
}