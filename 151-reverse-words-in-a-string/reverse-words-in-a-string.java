class Solution {
    public String reverseWords(String s) {
        String []st=s.split("\\s+");
        String ans="";
        for(int x=st.length-1;x>=0;x--)
        {
            
             ans+=st[x]+" ";
            

        }
        return ans.trim();
    }
}