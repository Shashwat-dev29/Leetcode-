class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String>list=new ArrayList<>();
        int x=0;
        int y=1;
        int g=0;
        while(x!=target.length)
        {
            if(y!=target[x])
            {
                list.add("Push");
                list.add("Pop");
                g=+2;
                y++;
            }
            else
            {
                list.add("Push");
                g++;
                y++;
                x++;
            }
        }
        return list;
    }
}
