class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char smallest='|';
        
        int start=0;
        int end= letters.length-1;
        while(start<=end)
        {
          int mid=start+(end-start)/2;
          if(letters[mid]>target )
          {
            smallest=letters[mid];
            end=mid-1;
          }
         
          else if(letters[mid]<=target)
          {
            start=mid+1;
          }
        }
        if(smallest=='|')
        {
            return letters[0];
        }
       
        return smallest;
    }
}
