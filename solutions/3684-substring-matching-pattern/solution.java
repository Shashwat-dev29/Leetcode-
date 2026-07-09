class Solution {
    public boolean hasMatch(String s, String p) {
        String []st=p.split("\\*");
        if((st.length==0) && (p.contains("*")))
        {
            return true;
        }
        if(st.length==1)
            {
                if(s.contains(st[0]))
                {
                    return true;
                } 
            }
            int index=0;
        for(int x=0;x<st.length;x++)
        {
            
           if (st[x].isEmpty()) {
        continue;
    }

    int pos = s.indexOf(st[x], index);

    if (pos == -1) {
        return false;
    }

    index = pos + st[x].length();
}
       return true;
    }
}
