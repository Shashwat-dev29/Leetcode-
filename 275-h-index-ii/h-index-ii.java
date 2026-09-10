class Solution {
    public int hIndex(int[] citations) {
       int left = 0;
        int right = citations.length - 1;
        while (left < right) {
            int temp = citations[left];
            citations[left] = citations[right];
            citations[right] = temp;
            left++;
            right--;
        }
        int count=0;
        for(int x=0;x<citations.length;x++)
        {
            if(citations[x]<=x)
            {
                count ++;
            }
        }
        return citations.length-count; 
    }
}