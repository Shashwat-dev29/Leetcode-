class Solution {
    public int findDuplicate(int[] arr) {
       
         int x=0;
         while(x<arr.length)
         {
             int correct=arr[x]-1;
             if(arr[x]!=arr[correct])
             {
                 int temp=arr[x];
                 arr[x]=arr[correct];
                 arr[correct]=temp;
                 
             }
             else{
                 x++;
             }
         }
        int n=0;
      for(int y=0; y<arr.length;y++)
      {
          if(arr[y]!=y+1)
         {
             n=arr[y];
              break;
         }
       }
      return n;   
    }
}
