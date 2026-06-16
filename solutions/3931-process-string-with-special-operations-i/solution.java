class Solution {
    public String processStr(String s) {
        StringBuilder result=new StringBuilder();
        for(int x=0;x<s.length();x++)
        {
            if(s.charAt(x)=='*')
            {
                if (result.length() > 0)
                {
                  result.deleteCharAt(result.length() - 1);
                }
            }
            else if(s.charAt(x)=='#')
            {
                result.append(result);
            }
            else if(s.charAt(x)=='%')
            {
              result.reverse();
            }
            else
            {
                result.append(s.charAt(x));
            }
        }
        return result.toString();
    }
}
