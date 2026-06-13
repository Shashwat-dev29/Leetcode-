class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans="";
        String alph="zyxwvutsrqponmlkjihgfedcba";
        for(int i=0;i<words.length;i++)
        {
            int Sum=0;
            for(int x=0;x<words[i].length();x++)
            {
                int index=words[i].charAt(x)-'a';
              Sum+=weights[index];
            }
            ans+=alph.charAt(Sum%26);
        }
        return ans;
    }
}
