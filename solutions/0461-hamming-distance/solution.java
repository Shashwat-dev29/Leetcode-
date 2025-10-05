 class Solution
 {

 public int hammingDistance(int x, int y) {
       int xor=x^y;
        int count=0;
       
   String s=Integer.toBinaryString(xor);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                count++;
            }
        }
        return count;
    }
}
