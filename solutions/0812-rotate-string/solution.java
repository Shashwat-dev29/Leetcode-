class Solution {
    public boolean rotateString(String s, String goal) {
        if(goal.length()!=s.length())
        {
            return false;
        }
        String g=s+s;
        if(g.contains(goal))
        {
            return true;
        }
        return false;
    }
}
