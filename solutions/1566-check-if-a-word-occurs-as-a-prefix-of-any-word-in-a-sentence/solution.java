class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String []str=sentence.split(" ");
        for(int x=0;x<str.length;x++)
        {
            if(str[x].length()>=searchWord.length())
            {
                if(str[x].startsWith(searchWord))
                {
                    return x+1;
                }
            }
        }
        return -1;
    }
}
