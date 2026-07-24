class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int x=0;x<s.length();x++)
        {
            if(map.get(s.charAt(x))!=null)
            {
              map.put(s.charAt(x),map.get(s.charAt(x))+1);
            }
            else
            {
            map.put(s.charAt(x),1);
            }

        }
        for(int x=0;x<s.length();x++)
        {
            if(map.get(s.charAt(x))==1)
            {
             return x;
            }
           
            
        }
        return -1;
    }
}