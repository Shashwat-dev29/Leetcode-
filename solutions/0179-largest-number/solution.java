class Solution {
    public String largestNumber(int[] nums) {
        long ans[] = Arrays.stream(nums).mapToLong(i -> i).toArray();
        
        for(int y=0; y<nums.length;y++)
        {
        ans=largest(ans);
        }
        if(ans[0] == 0)
{
    return "0";
}
        // String str="";
        // for(int x=0;x<nums.length;x++)
        // {
        //   str+=String.valueOf(ans[x]);
        // }
        StringBuilder str = new StringBuilder();
for(long x : ans) {
    str.append(x);
}
return str.toString();
        
    }
    public long[] largest (long []num)
    {
        
        int x=0;
        
        while(x+1<num.length)
        
        {
            long a=num[x];
        long b=num[x+1];
        String n1=String.valueOf(a)+String.valueOf(b);
        String n2=String.valueOf(b)+String.valueOf(a);
        if(n1.compareTo(n2) >= 0)
        {
            x++;
            continue;
        }
        else
        {
            num[x]=b;
            num[x+1]=a;
        }
        x++;
        }
        return num;
    }
}
