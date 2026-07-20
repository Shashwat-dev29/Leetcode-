class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int prod=1;
        while(n>0)
        {
            int nu=n%10;
            sum+=nu;
            prod*=nu;
            n=n/10;
        }
        return prod-sum;
    }
}