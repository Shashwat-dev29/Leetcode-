class Solution {
    
    public int addDigits(int num) {
        Solution obj=new Solution();
        int sum=obj.su(num);
      while(sum>=10)
      {
        sum=obj.su(sum);
      }
      return sum;
    }
    public int su(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}
