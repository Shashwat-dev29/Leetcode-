// class Solution {
//     public int subsetXORSum(int[] nums) {
//          List<List<Integer>> list=subset(nums);
//          int sum=0;
//         for(int x=0;x<list.size();x++)
//         {
//             int xor=0;
//             for(int y=0;y<list.get(x).size();y++)
//             {
//                xor=xor^list.get(x).get(y);
//             }
//             sum+=xor;
//         }
//         return sum;
//     }
//     public List<List<Integer>> subset(int[]nums)
//     {
       
//         List<List<Integer>> outer=new ArrayList<>();
//         outer.add(new ArrayList<>());
//         for(int num=0;num<nums.length;num++)
//         {
//             int n=outer.size();
//             for(int i=0;i<n;i++)
//             {
//                 List<Integer> internal=new ArrayList<>(outer.get(i));
//                 internal.add (nums[num]);
//                 outer.add(internal);
//             }
//         }
//         return outer;
//     }
// }




class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }

    public int dfs(int[] nums, int index, int xor) {
        if (index == nums.length) {
            return xor;
        }

        // Include current element
        int include = dfs(nums, index + 1, xor ^ nums[index]);

        // Exclude current element
        int exclude = dfs(nums, index + 1, xor);

        return include + exclude;
    }
}
