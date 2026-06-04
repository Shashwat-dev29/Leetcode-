class Solution {
    int coun=0;
    public int totalWaviness(int num1, int num2) {
        int ans;
        if(num1<100 && num2<100)
        {
            return 0;
        }
         ans=ansc(num1,num2,num1);
        return ans;

        
    }
    public int ansc(int n1,int n2,int no)
    {
     if(no>n2)
     {
       return coun;
     }   
     String s=Integer.toString(no);
     coun+= valpeak(s);
     return ansc(n1,n2,no+1);
    }
   public int valpeak(String n)
   {
    int count=0;
    for(int x=1;x<n.length()-1;x++)
    {
        if((n.charAt(x)<n.charAt(x+1)&&n.charAt(x)<n.charAt(x-1))||(n.charAt(x)>n.charAt(x+1)&&n.charAt(x)>n.charAt(x-1)))
        {
            count++;
        }
        
    }
    return count;
   }
}
