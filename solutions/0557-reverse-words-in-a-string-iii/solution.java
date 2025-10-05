class Solution {
    public String reverseWords(String s) {
        String str="";
        s=s.trim()+" ";
        String word="";
        for(int x=0;x<s.length();x++)
        {
            char ch=s.charAt(x);
            
            if(ch!=' ')
            {
                word=ch+word;
            }
            else
            {
                str+=word+" ";
                word="";
            }
            
        }
        return str.trim();
    }
}
