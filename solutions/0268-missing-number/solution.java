class Solution {
    public int missingNumber(int[] arr) {
        int x=0;
  while(x<arr.length)
  {
      if(arr[x]==x||arr[x]==arr.length)
      {
          x++;
      }
      else
      {
          int y=arr[x];
          int temp=arr[y];
          arr[y]=arr[x];
          arr[x]=temp;
      }
  }
  int n=arr.length;
  for(int y=0;y<arr.length;y++)
  {
      if(arr[y]!=y)
      {
          return y;
        
      }
    }
    return n;
    }
}
