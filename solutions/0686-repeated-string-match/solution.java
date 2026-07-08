class Solution {
    public int repeatedStringMatch(String a, String b) {
       String orig=a;
        int count=1;
        int len =(int)Math.ceil(b.length() / a.length()) + 2;
        while(a.contains(b)!=true && count<len)
        {
            a+=orig;
            count++;
        }
        if(a.contains(b))
        {
        return count;
        }
        return-1;
    }
}
