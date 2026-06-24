class Solution {
    public String addStrings(String num1, String num2) {
        int n1=num1.length()-1;
        int n2=num2.length()-1;
        String ans="";
        int carry=0;
        while(n1>=0 && n2>=0)
        {
            int sum=Integer.parseInt(String.valueOf(num1.charAt(n1)))+Integer.parseInt(String.valueOf(num2.charAt(n2)))+carry;
            if(sum>=10 )
            {
              ans=Integer.toString(sum%10)+ans;
              carry=sum/10;
            }
            else
            {
               ans=Integer.toString(sum)+ans;
               carry=0;
            }
            n1--;n2--;
        }
        if(n1>=0)
        {
            while(n1>=0)
            {
                int sum=carry+Integer.parseInt(String.valueOf(num1.charAt(n1)));
                if(sum>=10)
            {
              ans=Integer.toString(sum%10)+ans;
              carry=sum/10;
            }
            else
            {
               ans=Integer.toString(sum)+ans;
               carry=0;
            }
            n1--;
            }
        }
        else if(n2>=0)
        {
           while(n2>=0)
            {
                int sum=carry+Integer.parseInt(String.valueOf(num2.charAt(n2)));
                if(sum>=10)
            {
              ans=Integer.toString(sum%10)+ans;
              carry=sum/10;
            }
            else
            {
               ans=Integer.toString(sum)+ans;
               carry=0;
            }
            n2--; 
        }
        
       
        }
        if(carry!=0)
        {
         ans=Integer.toString(carry)+ans;
        }
        return ans;
    }
}

