class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int x=0;
       int y=numbers.length-1;
       int ans[]=new int[2];
       while(x<y)
       {
        if(numbers[x]+numbers[y]==target)
        {
          ans[0]=x+1;
          ans[1]=y+1;
          break;
        }
        else if(numbers[x]+numbers[y]<target)
        {
          x++;
        }
        else 
        {
          y--;
        }
       } 
       return ans;
    }
}
