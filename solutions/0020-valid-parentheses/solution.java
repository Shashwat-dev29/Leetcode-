class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> arr = new ArrayList<>();
        int y=0;
        for(int x=0;x<s.length();x++)
        {
            if(s.charAt(x)=='('||s.charAt(x)=='['||s.charAt(x)=='{')
            {
                arr.add(s.charAt(x));
                y++;
            }
            else if(s.charAt(x)==')')
            {
                if(y==0)
    {
        return false;
    }
                char si=arr.get(y-1);
                if(si=='(')
                {
                 arr.remove(y-1);
                 y--;
                }
                else
                {
                    return false;
                }
            }
             else if(s.charAt(x)==']')
            {
                if(y==0)
    {
        return false;
    }
                char si=arr.get(y-1);
                if(si=='[')
                {
                 arr.remove(y-1);
                 y--;
                }
                else
                {
                    return false;
                }
            }
             else if(s.charAt(x)=='}')
            {
                if(y==0)
    {
        return false;
    }
                char si=arr.get(y-1);
                if(si=='{')
                {
                 arr.remove(y-1);
                 y--;
                }
                else
                {
                    return false;
                }
            }
        }
        if(y==0)
        {
            return true;
        }
        return false;
    }
}
