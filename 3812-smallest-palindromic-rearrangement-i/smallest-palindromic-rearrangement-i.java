class Solution {
    public String smallestPalindrome(String s) {
        char arr[]=new char[s.length()/2];
        StringBuilder ans = new StringBuilder();
        for(int x=0;x<s.length()/2;x++)
        {
            arr[x]=s.charAt(x);
        }
        Arrays.sort(arr);
        if(s.length()%2==0)
        {
            for(int x=0;x<arr.length;x++)
            {
                ans.append(arr[x]);
            }
             for(int x=arr.length-1;x>=0;x--)
            {
                ans.append(arr[x]);
            }
        }
        else
        {
             for(int x=0;x<arr.length;x++)
            {
                ans.append(arr[x]);
            }
            ans.append(s.charAt((s.length()/2)));
             for(int x=arr.length-1;x>=0;x--)
            {
                ans.append(arr[x]);
            }
        }
      return ans.toString();
    }
}