class Solution {
    public int maxRepeating(String sequence, String word) {
        int c=0;
        String orig=word;
        while(word.length()<=sequence.length())
        {
            if(sequence.contains(word))
            {
                c++;
                word+=orig;
            }
            else
            {
                break;
            }
        }
        return c;
    }
}