import java.util.Scanner;
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       
        int f=0;
        int l=(matrix[0].length*matrix.length)-1;
        while(f<=l)
        {
          int mid=f+(l-f)/2;
          if(matrix[mid/matrix[0].length][mid%matrix[0].length]==target)
          {
            return true;
          }
          else if(matrix[mid/matrix[0].length][mid%matrix[0].length]>target)
          {
               l=mid-1;
          }
          else if(matrix[mid/matrix[0].length][mid%matrix[0].length]<target)
          {
         
            f=mid+1;
          }
        }
      return false;
      
    }
    
}
