class Solution {
    public int[] resultArray(int[] nums) {
    ArrayList<Integer>list1=new ArrayList<>();
    ArrayList<Integer>list2=new ArrayList<>();
    list1.add(nums[0]);
    int c1=1;
    list2.add(nums[1]);
    int c2=1;
    for(int x=2;x<nums.length;x++)
    {
       if( list1.getLast()>list2.getLast())
       {
        list1.add(nums[x]);
        c1++;
       }
       else
       {
        list2.add(nums[x]);
        c2++;
       }
    }
    int ans[]=new int[nums.length];
    int x=0;
    while(x<c1)
    {
       ans[x]=list1.get(x);
       x++;
    }
    int x2=0;
    while(x2<c2)
    {
        ans[x]=list2.get(x2);
        x++;
        x2++;
    }
    return ans;
    }
}