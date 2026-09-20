class Solution {
    public int reverseDegree(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int ii=96;
        int y=26;
        for(int x=1;x<=26;x++)
        {
            int b=x+ii;
            char cr=(char)b;
            map.put(cr,y);
            y--;
        }
        int sum=0;
        for(int x=0;x<s.length();x++)
        {
            int c=(map.get(s.charAt(x))*(x+1));
            sum+=c;
        }
        return sum;
    }
}