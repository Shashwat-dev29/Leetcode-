class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int max=0;
        for(int y=0;y<s.length();y++)
        {
            String ls="";
        for(int x=y;x<s.length();x++)
        {
           
            if(ls.contains(String.valueOf(s.charAt(x))))
            {
               break;
            }
            else
            {
                ls+=s.charAt(x);
            }
            if(ls.length()>max)
            {
                max=ls.length();
            }
            
        }
        }
        return max;
    }
}
