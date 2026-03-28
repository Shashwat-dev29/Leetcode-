class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int x=0;x<image.length;x++)
        {
            int a=0;
            int b= image.length-1;
            while(b>a)
            {
                int temp=image[x][a];
              image[x][a]=image[x][b];
              image[x][b]=temp;
              a++;
              b--;
            }
        }
        for(int x=0;x<image.length;x++)
        {
           for(int y=0;y<image[0].length;y++)
        {
           if(image[x][y]==0)
           {
            image[x][y]=1;
           }
           else
           {
            image[x][y]=0;
           }
        } 
        }
      return image;
    }
}
