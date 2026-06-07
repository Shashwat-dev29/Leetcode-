class Solution {
    int sum=0;
    int x=0;
    public int sumOfGoodIntegers(int n, int k) {
        if(x>n+k)
        {
            return sum;
        }
        if(Math.abs(n-x)<=k && (n&x)==0)
        {
            sum+=x;
        }
        x++;
         sum=sumOfGoodIntegers(n,k);
        return sum;
    }
}
