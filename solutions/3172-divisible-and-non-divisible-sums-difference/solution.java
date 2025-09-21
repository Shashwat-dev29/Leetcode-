class Solution {
    public int differenceOfSums(int n, int m) {
        int num1=0;
        int num2=0;
        for(int x=1;x<=n;x++)
        {
            if(x%m==0)
            {
                num2+=x;
            }
           else if(x%m!=0) 
           {
            num1+=x;
           }
        }
        return(num1-num2);
    }
}
