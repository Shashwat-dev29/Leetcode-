class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int x=0;x<words.length;x++)
        {
            for(int y=x+1;y<words.length;y++)
            {
                if((x!=y)&&words[y].startsWith(words[x])&&words[y].endsWith(words[x]))
                {
                    count++;
                }
            }
        }
        return count;
    }
}