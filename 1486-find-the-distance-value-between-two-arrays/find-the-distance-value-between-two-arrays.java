class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int k=0;
        int count=0;
        while(k<arr1.length)
        {
            boolean flag=true;
            for(int x=0;x<arr2.length;x++)
            {
                if(Math.abs(arr1[k]-arr2[x])<=d)
                {
                    flag=false;
                    break;
                }
            }
            if (flag==true)
            {
             count++;
            }
            k++;
        }
        return count;
    }
}