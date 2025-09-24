class Solution {
    public boolean isPalindrome(String s) {
        String b="";
       
        s=s.toLowerCase();
        for(int x=0;x<s.length();x++)
        {
            
            
            if(Character.isLetter(s.charAt(x))==true||Character.isDigit(s.charAt(x))==true)
            {
                b=b+s.charAt(x);
            }
        }
        int c=0;
        int d=b.length()-1;
        while(c<d)
        {
            if(b.charAt(c)!=b.charAt(d))
            {
                return false;
            }
            c++;
            d--;
        }
        return true;
        
    }
}
