class Solution {
    public int mySqrt(int num) {
        int first=1;
        int last= num;
       
       int a=0;
        while(first<=last)
        {
              int mid= first+(last-first)/2;
           if (mid == num / mid) {
                return mid; 
            } else if (mid < num / mid) {
                a = mid;      
                first = mid + 1;
            } else {
                last = mid - 1;
            }
            
        }
        return a;
    }
}
