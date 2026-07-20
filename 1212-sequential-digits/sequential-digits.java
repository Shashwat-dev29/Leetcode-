class Solution {
    List <Integer> list=new ArrayList<>();
    public List<Integer> sequentialDigits(int low, int high) {
        String s="123456789";
        for(int x=2;x<=s.length();x++)
        {
          for(int y=0;y<=s.length()-x;y++)
          {
            int digit=Integer.parseInt(s.substring(y,y+x));
            if(digit>=low && digit<=high)
            {
                list.add(digit);
            }
          }
        }
        return list;
    }
}