class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        boolean flag=false;
        for(int x=1;x<arr.length-1;x++)
        {
            if(arr[x]%2!=0&&arr[x+1]%2!=0&&arr[x-1]%2!=0)
            {
                flag=true;
            }
        }
        return flag;
    }
}
