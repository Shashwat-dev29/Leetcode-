class Solution {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        permutation(nums, 0);
        return list;
    }

    public void permutation(int[] nums, int t) {
        if (t == nums.length) {
            return;
        }
        List<Integer> i = new ArrayList<>();
        // i.add(nums[t]);
        for (int x = 0; x < nums.length; x++) {
            // if (t != x) {
            //     i.add(nums[x]);
            // }
             List<Integer> ii = new ArrayList<>();
              int temp=nums[t];
                 nums[t]=nums[x];
                 nums[x]=temp;
                 for (int y = 0; y < nums.length; y++) {
                  ii.add(nums[y]);
             }
              permutation(nums, t + 1);
              temp=nums[t];
                 nums[t]=nums[x];
                 nums[x]=temp;

                 if (!list.contains(ii)) {
                    list.add(ii);
                 }
        }

        // if (!list.contains(i)) {
        //             list.add(i);
        //         }
       
    }

}
