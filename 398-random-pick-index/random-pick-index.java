class Solution {
    int nums[];
    public Solution(int[] nums) {
    this.nums=nums;    
    }
    
    public int pick(int target) {
        List<Integer>list=new ArrayList<>();
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]==target)
            {
                list.add(x);
            }
        }
        Random rand = new Random();
        
        // 2. Generate a random index from 0 to list.size() - 1
        int randomIndex = rand.nextInt(list.size());
        
        // 3. Get the item
        int randomNumber = list.get(randomIndex);
        return randomNumber;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */