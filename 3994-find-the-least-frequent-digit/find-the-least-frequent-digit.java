class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Character,Integer>map=new HashMap<>();
        String s=Integer.toString(n);
        for(int x=0;x<s.length();x++)
        {
            map.put(s.charAt(x),map.getOrDefault(s.charAt(x),0)+1);
        }
        int min=Integer.MAX_VALUE;
        int num=-1;
        for(char x : map.keySet())
        {
            if(map.get(x)<min)
            {
                min=map.get(x);
                num=Integer.parseInt(String.valueOf(x));
            }
            else if(map.get(x)==min)
            {
                if(Integer.parseInt(String.valueOf(x))<num)
                {
                num=Integer.parseInt(String.valueOf(x));
                }
            }
        }
        return num;
    }
}