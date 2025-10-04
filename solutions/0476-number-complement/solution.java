class Solution {
    public int findComplement(int num) {
        String s=Integer.toBinaryString(num);
        String g="";
        for(int x=0;x<s.length();x++)
        {
            if(s.charAt(x)=='0')
            {
                g=g+'1';
            }
            else if(s.charAt(x)=='1')
            {
                g=g+'0';
            }
        }
        return  Integer.parseInt(g, 2);
        
    }
}
