class Solution {
    public int maxArea(int[] height) {
        int x=0;
        int y=height.length-1;
        int maxm=0;
        while(x<y)
        {
          int ar=(Math.min(height[x],height[y])*(y-x));
          maxm=Math.max(maxm,ar);
          if(height[x]>height[y])
          {
            y--;
          }
          else
          {
            x++;
          }
        }
        return maxm;
    }
   
}
