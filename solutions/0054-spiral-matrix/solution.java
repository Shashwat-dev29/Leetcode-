// class Solution {
//     public List<Integer> spiralOrder(int[][] matrix) {
//        ArrayList<Integer>list=new ArrayList<>();
//         int top=0;
//         int left =0;
//         int right=matrix[0].length-1;
//         int bottom=matrix.length-1;
//         int i=0;
//         int j=0;
//         // for(int x=0;x<matrix.length*matrix[0].length;x++)
//         while(list.size() < matrix.length * matrix[0].length)
//         {
//             if(j<right && i==top)
//             {
//               list.add(matrix[i][j]);
//               j++;
//             }
            
//             else if(j==right && i<bottom)
//             {
//                 list.add(matrix[i][j]);
//              i++; 
//             }
//             else if(j==right && i==bottom)
//             {
//                 list.add(matrix[i][j]);
               
//                j--; 
//              right--;
//             }

//             else if(j>left && i==bottom)
//             {
//               list.add(matrix[i][j]);
//               j--;
//             }
//             else if(j==left && i==bottom)
//             {
//                 list.add(matrix[i][j]);
//                 bottom--;
//             }
//             else if(i>top&&j==left)
//             {
//                 list.add(matrix[i][j]);
//                 i--;
//             }
//             else if(j==left && i==top+1)
//             {

//                left++; 
//              top++;
//              i = top;
//               j = left;
//             }
//         }
//         return list;
//     }
// }


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int top = 0;
        int left = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int i = 0;
        int j = 0;
        
        // 0: Right, 1: Down, 2: Left, 3: Up
        int dir = 0; 

        while (list.size() < matrix.length * matrix[0].length) {
            
            // Add the element FIRST. This prevents you from having 
            // to write list.add() inside every single if-statement!
            list.add(matrix[i][j]); 

            if (dir == 0) { // Moving Right
                if (j < right) {
                    j++;
                } else { // Hit Top-Right corner
                    top++;   // Shrink top boundary
                    dir = 1; // Turn Down
                    i++;
                }
            } 
            else if (dir == 1) { // Moving Down
                if (i < bottom) {
                    i++;
                } else { // Hit Bottom-Right corner
                    right--; // Shrink right boundary
                    dir = 2; // Turn Left
                    j--;
                }
            } 
            else if (dir == 2) { // Moving Left
                if (j > left) {
                    j--;
                } else { // Hit Bottom-Left corner
                    bottom--; // Shrink bottom boundary
                    dir = 3;  // Turn Up
                    i--;
                }
            } 
            else if (dir == 3) { // Moving Up
                if (i > top) {
                    i--;
                } else { // Hit Inner Top-Left corner
                    left++;  // Shrink left boundary
                    dir = 0; // Turn Right again
                    j++;
                }
            }
        }
        return list;
    }
}
