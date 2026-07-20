class Solution {
    public boolean judgeSquareSum(int c) {
        int n=(int)Math.floor(Math.sqrt(c));
        int arr[]=new int[n+1];
        for (int x=0;x<arr.length;x++)
        {
           arr[x]=x;
        }
        int s=0;
        int e=arr.length-1;
        while(s<=e)
        {
             if((Math.pow(s,2)+Math.pow(e,2))==c)
            {
                return true;
            }
            else if((Math.pow(arr[s],2)+Math.pow(arr[e],2))>c)
            {
              e=e-1;
            }
            else if((Math.pow(arr[s],2)+Math.pow(arr[e],2))<c)
            {
              s=s+1;
            }

        }
        return false;
    }
}