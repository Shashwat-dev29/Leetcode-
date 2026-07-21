class Solution {
    public List<Integer> findLonely(int[] nums) {
        List <Integer> list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x=0;x<nums.length;x++)
        {
            if(map.get(nums[x])!=null)
            {
            map.put(nums[x],map.get(nums[x])+1);
            }
            else
            {
                  map.put(nums[x],1);
            }
        }
        for(int x=0;x<nums.length;x++)
        {
            if(map.get(nums[x])==1 && map.get(nums[x]-1)==null && map.get(nums[x]+1)==null)
            {
               
                    list.add(nums[x]);
                
            }
        }
        return list;
    }
}