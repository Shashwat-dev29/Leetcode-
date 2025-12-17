class Solution {
    public int titleToNumber(String columnTitle) {
        int num=0;
        int y=columnTitle.length()-1;
        for(int x=0;x<columnTitle.length();x++)
        {
           
          num+=(Math.pow(26,y)*(columnTitle.charAt(x)-64));
          y--;
           
        }
        return num;
    }
}
