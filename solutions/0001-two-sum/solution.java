import java.util.Scanner;
class Solution {
    public int[] twoSum(int[]arr1 , int targ)
    {
        int x=0;
        int y=0;
while(x<arr1.length)
{
    for( y=x+1; y<arr1.length; y++)
    {
if(arr1[x]+arr1[y]==targ)
{
   return new int[]{x,y};
}
  }
  x++;    
    }
     return new int[]{x,y};
    }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of the array");
int a=sc.nextInt();
int arr[]=new int[a];
for(int b=0; b<a; b++)
{
    arr[b]=sc.nextInt();
}
System.out.println("enter the target");
int tar= sc.nextInt();
Solution obj=new Solution();
int[] arr2=obj.twoSum(arr,tar);
for(int c=0; c<arr.length ; c++)
{
    System.out.print(arr2[c]);
}

    sc.close();
}
}

