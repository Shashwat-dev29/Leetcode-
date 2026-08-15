class Solution {
    int suma=0;
    public int fib(int n) {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        sum(n,suma,1,1);
      return suma;
    }
    public void sum(int n,int a,int b,int x)
    {
        if(x>=n)
        {
            return;
        }
        suma=a+b;
        sum(n,b,suma,x+1);
    }
}