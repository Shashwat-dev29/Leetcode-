class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        ArrayList<Integer>list=new ArrayList<>();
        if(mountain.length==1)
        {
            list.add(mountain[0]);
            return list;
        }
       
        for(int x=1;x<mountain.length-1;x++)
        {
            if(mountain[x]>mountain[x+1]&&mountain[x]>mountain[x-1])
            {
                list.add(x);
            }
            
        }
       
        return list;
    }
}
