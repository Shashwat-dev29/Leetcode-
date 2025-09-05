class Solution {
    public int reverse(int x) {
        long num=Math.abs(x);
        long ne=0;
        while(num>0)
        {
            ne=(ne*10)+(num%10);
            num=num/10;
        }
        if(ne>2147483647)
        {
            return 0;
        }
        if(x<0)
        {
       return (int)-ne; 
        }
       return  (int)ne;
    }
}
