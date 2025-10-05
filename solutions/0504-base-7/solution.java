class Solution {
    public String convertToBase7(int num) {
        int x=num;
        String s="";

        num=Math.abs(num);
        if(num==0)
        {
            return "0";
        }
        while(num>0)
        {
            s=Integer.toString(num%7)+s;
            num=num/7;
        }
        if(x<0)
        {
            s="-"+s;
        }
        
        return s;
    }
}
