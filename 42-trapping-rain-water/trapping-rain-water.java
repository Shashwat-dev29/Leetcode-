class Solution {
    public int trap(int[] height) {
        int max=0;
        Stack<Integer> stack=new Stack<>();
        for(int x=height.length-1;x>=0;x--)
        {
            if(height[x]>max)
            {
                max=height[x];
            }
            stack.push(max);
        }
        max=0;
        int sum=0;
        for(int x=0;x<height.length;x++)
        {
            if(max<height[x])
            {
              max=height[x];
            }
            sum+=(Math.min(max,stack.pop())-height[x]);
        }
        return sum;
    }
}