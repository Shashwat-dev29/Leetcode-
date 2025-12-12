class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int i=0;
        int j=0;
        int x=0;
        int len=num1.length+num2.length;
        int arr[]=new int[len];
        while(i<num1.length&&j<num2.length)
        {
           if(num1[i]<=num2[j])
           {
            arr[x]=num1[i];
            x++;
            i++;
           }
           else
           {
            arr[x]=num2[j];
            x++;
            j++;
           }
        }
        if(i<num1.length)
        {
          for(int a=i;a<num1.length;a++)
          {
            arr[x]=num1[a];
            x++;
          }
        }
        if(j<num2.length)
        {
          for(int b=j;b<num2.length;b++)
          {
            arr[x]=num2[b];
            x++;
          }
        }
        if(arr.length%2==0)
        {
            int mid=arr.length/2;
            return ((arr[mid]+arr[mid-1])/2.0);
        }
        return arr[arr.length/2];
    }
}
