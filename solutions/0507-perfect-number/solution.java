class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int x=1;x<=num/2;x++)
        {
            if(num%x==0)
            {
                sum+=x;
            }
        }
        if(sum==num)
        {
            return true;
        }
        return false;
    }
}
