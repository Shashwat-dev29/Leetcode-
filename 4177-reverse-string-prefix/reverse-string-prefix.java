class Solution {
    public String reversePrefix(String s, int k) {
        String si="";
       for(int x=k-1;x>=0;x--)
       {
        si+=s.charAt(x);
       } 
       String p=s.substring(k);
       return si+p;
    }
}