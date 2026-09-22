class Solution {
    HashMap<Integer,Integer>map=new HashMap<>();
    public int mostFrequentEven(int[] nums) {
       for(int x=0;x<nums.length;x++)
       {
        if(nums[x]%2==0)
        {
            map.put(nums[x],map.getOrDefault(nums[x],0)+1);
        }
       } 
       int max = 0;
int number = -1;

for(int x : map.keySet())
{
    if(map.get(x) > max)
    {
        max = map.get(x);
        number = x;
    }
    else if(map.get(x)==max)
    {
        if(number>x)
        {
            number=x;
            max=map.get(x);
        }
    }
}
return number;
    }
}