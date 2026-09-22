class Solution {
    int nums[];
    int copy[];
    public Solution(int[] nums) {
        this.nums=nums;
        copy=nums.clone();
    }
    
    public int[] reset() {
        nums=copy.clone();
        return nums;
    }
    
    public int[] shuffle() {
        Random rand=new Random();
        for(int x=0;x<nums.length;x++)
        {
            int j=(int)Math.floor(Math.random() * nums.length);
            int temp=nums[x];
            nums[x]=nums[j];
            nums[j]=temp;
        }
        return nums;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */