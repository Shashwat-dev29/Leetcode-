class Solution {
     List<List<Integer>>list =new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>list1=new ArrayList<>();
       subarray(nums,list1,0);
       return list;
        
    }
    public void subarray(int[]nums,List<Integer>list1,int x)
    {
      if(x==nums.length)
      {
        list.add(new ArrayList<>(list1));
        return;
      }
      subarray(nums,list1,x+1);
      list1.add(nums[x]);
      subarray(nums,list1,x+1);
       list1.remove(list1.size() - 1); 
    }
}