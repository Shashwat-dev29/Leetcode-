class Solution {
    public boolean isAnagram(String s, String t) {
     if(s.length()!=t.length())
     {
       return false; 
     }
     String a=sort(s);
     String b=sort(t);
     if(a.equals(b))
     {
        return true;
     }
       return false;
    }
    public String sort(String su1)
    {
        char[] arr = su1.toCharArray();
     Arrays.sort(arr);
      String sorted = new String(arr);

       return sorted;
    }
}
