class Solution {
    List<List<Integer>>list=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer>list1=new ArrayList<>();
        subset(list1,nums,0);
        return list;
    }
    public void subset(List<Integer> list1, int nums[], int x) {
        list.add(new ArrayList<>(list1));

        for(int i = x; i < nums.length; i++) {
            if(i > x && nums[i] == nums[i - 1])
                continue;

            list1.add(nums[i]);
            subset(list1, nums, i + 1);
            list1.remove(list1.size() - 1);
        }
    }
}