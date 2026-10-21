class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]==target)
            {
                list.add(x);
            }
        }
        return list;
    }
}