class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int c=0;
         int count=0;
         ArrayList<Integer>list=new ArrayList<>();
        for(int x=0;x<nums.length;x++)
        {
           
            // if(nums[x]==nums[x-1])
            // {
            //   count++;
            //   if(count<k)
            //   {
            //     list.add(nums[x]);
            //     c++;
            //   }
            // }
            // else
            // {
            //     count=1;
            //     list.add(nums[x]);
            //     c++;
            // }

            if (x == 0 || nums[x] != nums[x - 1]) {
                count = 1;
                list.add(nums[x]);
                c++;
            }
            else {
                count++;

                if (count <= k) {
                    list.add(nums[x]);
                    c++;
                }
            }
        }
        int arr[]=new int[c];
        for(int x=0;x<c;x++)
        {
            arr[x]=list.get(x);
        }
        return arr;
    }
}