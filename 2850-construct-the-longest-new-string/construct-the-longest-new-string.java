class Solution {
    public int longestString(int x, int y, int z) {
      int min;
      int ans;
      if(y>x)
      {
        min=x;
      }
      else
      {
        min=y;
      }
      if((x>y)||(y>x))
      {
       ans=(min*2)+((min+1)*2)+(z*2);
      }
      else
      {
        ans=(min*2)+(min*2)+(z*2);
      }
      return ans;
    }
}