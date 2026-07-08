class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
      for(int x=0;x<words.length;x++)
      {
        if(words[x].startsWith(pref))
        {
            count++;
        }
      }
      return count;
    }
}
