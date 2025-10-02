class Solution {
    public int hammingWeight(int num) {
        Solution obj=new Solution();
       String str= obj.bin(num);
       int count=0;
       for(int x=0;x<str.length();x++)
       {
         if(str.charAt(x)=='1')
         {
            count++;
         }
       }
      return count;
    }
    public String bin(int no)
    {
        int n=no;
        String s="";
        while(n>0)
        {
           s=Integer.toString(n%2)+s;
           n=n/2;
        }
        return s;
    }
}
