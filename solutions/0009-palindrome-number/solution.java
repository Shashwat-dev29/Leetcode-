import java.util.Scanner;
class Solution {
    public boolean isPalindrome(int x) {
        double num=0;
        
        boolean flag= false;
        double copy = x;
        while(x>0)
        {
            num=(num* 10);
            num+=(x%10);
             
x=x/10;
        }
        if(num==copy)
        {
flag = true;
        }
        return flag;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number to check for palindrome");
        int n= sc.nextInt();
        Solution obj= new Solution();
        boolean pali=obj.isPalindrome(n);
        if(pali==true)
        {
            System.out.println("true");
    
        }
        else
        {
             System.out.println("false");
        }

    }
}
