class Solution {
    public int arrangeCoins(int n) {
        int x=n;
        int count=0;
        for(int y=1;y<=n;y++)
        {
            if(x>=y)
            {
                x=x-y;
                count++;
            }
            else
            {
                break;
            }
        }
        return count;
    }
}
