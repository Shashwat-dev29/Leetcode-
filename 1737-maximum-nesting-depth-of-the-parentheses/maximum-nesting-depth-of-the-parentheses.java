class Solution {
    public int maxDepth(String s) {
        int count=0;
        int max=-1;
        for(int x=0;x<s.length();x++)
        {
            if(s.charAt(x)=='(')
            {
                count++;
            }
            else if(s.charAt(x)==')')
            {
                count--;
            }
            if(count>max)
            {
                max=count;
            }

        }
        return max;
    }
}