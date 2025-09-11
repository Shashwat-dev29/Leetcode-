class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        
        int count=0;
        for(int x= s.length()-1; x>=0;x--)
        {
            char ch= s.charAt(x);
           if(ch!= ' ')
           {
           
            count ++;
           }
           else if(ch== ' ')
           {
            break;
           }
        }
        return count;
    }
}
