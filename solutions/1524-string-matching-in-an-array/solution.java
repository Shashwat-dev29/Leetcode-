class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> list=new ArrayList<>();
        for(int x=0;x<words.length;x++)
        {
            for(int y=0;y<words.length;y++)
            {
                if((x!=y)&&(words[x].contains(words[y]))&&(list.contains(words[y])==false))
                {
                    list.add(words[y]);
                }
            }
        }
        return list;
    }
}
