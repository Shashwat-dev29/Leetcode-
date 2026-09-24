class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int num=map.get(s.charAt(0));
        for(int x=1;x<s.length();x++)
        {
            if(map.get(s.charAt(x-1))>=map.get(s.charAt(x)))
            {
                num+=map.get(s.charAt(x));
            }
            else
            {
               num -= 2 * map.get(s.charAt(x-1));
num += map.get(s.charAt(x));
            }
        }
        return num;
    }
}