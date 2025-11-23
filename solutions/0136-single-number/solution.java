class Solution {
    public int singleNumber(int[] arr) {
        int sum=arr[0];
       
        for(int x=1;x<arr.length;x++)
        {
            sum=sum^arr[x];
        }
        
        return sum;
    }
}
