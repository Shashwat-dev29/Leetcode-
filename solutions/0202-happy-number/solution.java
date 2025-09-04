class Solution {
    public boolean isHappy(int n) {
       int num=n;
       int sum=0;
       boolean flag =false;
       int count=0;
       
        
         if(num==1)
        {
            return true;
            
        }
       
        while(num>=1)
    {
        if(count>40)
        {
            break;
        }
        else
        {
    
          if(num/10<=0 )
         {
            sum=sum+((num%10)*(num%10));
            num=sum;
             if(sum==1)
         {
            flag= true;
            break;
         }
         else
         {
            sum=0;
        }
         }
         else
         {
            sum=sum+((num%10)*(num%10));
            num=num/10;
         }
        }
        count++;
    }
      return flag;
    }
  
}
