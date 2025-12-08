class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        for(int x=0;x<=n;x++)
        {
           String y=binary(x);
           arr[x]=count(y);
        }
        return arr;
        
    }
    public String binary(int num)
    {
        String bin="";
        if(num==0)
        {
            return"0";
        }
       while(num>1)
       {
         bin=Integer.toString(num%2)+bin;
         num=num/2;
       }
       bin="1"+bin;
       return bin;
    }
    public int count(String s)
    {
        int count=0;
        for(int x=0;x<s.length();x++)
        {
            if(s.charAt(x)=='1')
            {
              count++;
            }
        }
        return count;
    }
}
