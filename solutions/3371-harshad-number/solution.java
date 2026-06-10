class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int a=x;
        int num=0;
        while(x>0)
        {
          num+=x%10;
          x=x/10;
        }
        if(a%num==0)
        {
            return num;
        }
        return -1;
    }
}
