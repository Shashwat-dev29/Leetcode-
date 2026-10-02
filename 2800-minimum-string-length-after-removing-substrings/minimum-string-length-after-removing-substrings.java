class Solution {
    public int minLength(String s) {
        int count=0;
        while(s.contains("AB")||s.contains("CD"))
        {
            if(s.contains("AB"))
            {
                s=s.replaceFirst("AB","");
                count++;
            }
            if(s.contains("CD"))
            {
                s=s.replaceFirst("CD","");
                count++;
            }
        }
        return s.length();
    }
}