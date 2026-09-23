class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x=0;x<nums.length;x++)
        {
        map.put(nums[x],map.getOrDefault(nums[x],0)+1);
        }
        int sum=0;
        for(int x:map.keySet())
        {
          if(map.get(x)%k==0)
          {
            sum+=(x*map.get(x));
          }
        }
        return sum;
    }
}