class NumArray {
    int pr[];

    
     public NumArray(int[] nums) {
        pr = new int[nums.length + 1];

        for(int i = 0; i < nums.length; i++) {
            pr[i + 1] = pr[i] + nums[i];
        }
    }
    public int sumRange(int left, int right) {
        int sum=0;
       
        return pr[right+1]-pr[left];
        // for(int x=left;x<=right;x++)
        // {
            
        //         sum+=nums[x];
            
            
        // }
        // return sum;

    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
