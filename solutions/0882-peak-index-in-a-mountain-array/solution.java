class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int fi=0;
        int la=arr.length-1;
        while(fi<la)
        {
            int mid=(fi+la)/2;
            if(arr[mid]>arr[mid+1])
            {
                la=mid;
            }
            else
            {
                fi=mid+1;
            }
        }
        return fi;
    }
}
