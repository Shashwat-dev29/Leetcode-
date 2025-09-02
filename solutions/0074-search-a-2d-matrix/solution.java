import java.util.Scanner;
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean flag=false;
        for(int y=0;y<matrix[0].length;y++)
        {
        for(int x=0;x<matrix.length;x++)
        {
            if(target==matrix[x][y])
            {
                flag=true;
            }
        }
        }
      return flag;
      
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows of a matrix");
        int r= sc.nextInt();
        System.out.println("enter the number of columns of a matrix");
        int c=  sc.nextInt();
        int arr[][]=new int[r][c];
         System.out.println("enter the number to be searched");
        int targ=  sc.nextInt();
        Solution obj= new Solution();
        boolean fl= obj.searchMatrix(arr,targ);
        if(fl==true)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println(fl);
        }
    }
}
