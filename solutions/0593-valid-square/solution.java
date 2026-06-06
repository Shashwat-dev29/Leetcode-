class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        double len[]=new double[6];
        len[0]=len(p1,p2);
         len[1]=len(p1,p3);
         len[2]=len(p2,p3);
         len[3]=len(p2,p4);
         len[4]=len(p4,p1);
         len[5]=len(p3,p4);
         Arrays.sort(len);
        //  for(int x=0;x<len.length;x++)
        //  {
        //     if(len[x]==0)
        //     {
        //         return false;
        //     }
        //  }
        if(len[1]!=0 &&len[1]==len[2] && len[1]==len[0] && len[1]==len[3] && len[4]==len[5]&&len[4]>len[3])
        {
            return true;
        }
        return false;
    }
    public double len(int[]s1,int[]s2)
    {
        double len=0;
        double x=s1[0]-s2[0];
        double y=s1[1]-s2[1];
        len=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return len;
    }
}
