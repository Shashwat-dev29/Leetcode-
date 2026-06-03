class Solution {
    // public char kthCharacter(int k) {
    //     String h="a";
    //     while(h.length()<k)
    //     { 
    //       h= ans(h);
    //     }
    //     return h.charAt(k-1);

    // }
    public char kthCharacter(int k) {
    return build("a", k).charAt(k - 1);
}

private String build(String s, int k) {
    if (s.length() >= k) {
        return s;
    }
   String ki=ans(s);
    return build(ki, k);
}
    public String ans(String ans1)
    { 
        String s=ans1;
        int n=0;
        for(int x=0;x<ans1.length();x++)
        {
            if(ans1.charAt(x)=='z')
            {
              n=(int) 'a'; 
            }
         n=ans1.charAt(x)+1;
         s=s+Character.toString((char) n);
        }
        return s;
       
    }
}
