class Solution {
    public String convert(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        int y=0;
        if (n == 1) return s;
        while(y<n)
        {
        int x=y;
        while(x<s.length())
        {
            sb.append(s.charAt(x));
            int second = (x + ((n*2)-2)) - (2 * y);
            if (y != 0 && y!= n - 1 && second < s.length()) {
                
               sb.append(s.charAt(second));
                
            }
            x+=(n*2)-2;
        }
        y++;
    }
    return sb.toString();
    }
}
