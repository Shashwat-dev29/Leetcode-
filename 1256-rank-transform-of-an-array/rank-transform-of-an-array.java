class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int sort[]=Arrays.copyOf(arr, arr.length);
      Arrays.sort(sort);
      int []ans=new int[arr.length];
      int count=1;
      for(int x=0;x<ans.length;x++)
      {
        if(map.get(sort[x])==null)
        {
             map.put(sort[x],count);
        count++;
        }
      }
       for(int x=0;x<ans.length;x++)
      {
        ans[x]=map.get(arr[x]);
      }
      return ans;
    }
}