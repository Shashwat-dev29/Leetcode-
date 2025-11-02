class Solution {
    public void sortColors(int[] arr) {
        int j=0;
        int k=0;
        int l=arr.length-1;
       while(k<=l)
        {
                 if(arr[k]==1)
                 {
                    k++;
                 }
                 else if(arr[k]==0)
                 {
                    int temp=arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;
                    j++;
                    k++;
                 }
                 else if(arr[k]==2)
                 {
                   int temp= arr[k];
                   arr[k]=arr[l];
                   arr[l]=temp;
                   l--;
                  
                 }
        }
    }
}
