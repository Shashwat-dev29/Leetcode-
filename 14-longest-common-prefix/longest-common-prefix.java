import java.util.Scanner;
class Solution {
    public String longestCommonPrefix(String[] strs) {
         if (strs == null || strs.length == 0) {
            return "";
        }

       
        String firstString = strs[0];

        
        for (int i = 0; i < firstString.length(); i++) {
            char currentChar = firstString.charAt(i);

           
            for (int j = 1; j < strs.length; j++) {
                
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    
                    return firstString.substring(0, i);
                }
            }
        }

    return firstString;
}
public static void main(String args[])
{
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the number of words you want to enter");
    int s= sc.nextInt();
    String arr[]=new String[s];
    for(int x=0;x<s;x++)
    {
       arr[x]=sc.next();
    }
    Solution obj=new Solution();
    String pre=obj.longestCommonPrefix(arr);
     System.out.println("longest common prefix is"+pre);

}
}