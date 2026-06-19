class Solution {
    public int largestAltitude(int[] gain) {
        int highest=0;
        int curr_alt=0;
        for(int x=0;x<gain.length;x++)
        {
            curr_alt+=gain[x];
            if(curr_alt>highest)
            {
                highest=curr_alt;
            }
        }
        return highest;
    }
}
