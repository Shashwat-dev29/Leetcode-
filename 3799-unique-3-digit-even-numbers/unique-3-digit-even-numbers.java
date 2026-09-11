// class Solution {
//     int count=0;
//     List<String>list=new ArrayList<>();
//     public int totalNumbers(int[] digits) {
//         numbers(digits,"",0);
//         for(int x=0;x<list.size();x++)
//         {
//             if(Integer.parseInt(list.get(x))%2==0)
//             {
//                 count++;
//             }
//         }
//         return count;
//     }
//     public void numbers(int[]nums,String s,int x)
//     {
//         if(x==nums.length)
//         {
//             if(s.length()==3)
//             {
//                list.add(s);
//             }
//             return;
//         }
//         numbers(nums,s,x+1);
//         numbers(nums,s+nums[x],x+1);
//     }
// }


class Solution {
    HashSet<Integer> set = new HashSet<>();

    public int totalNumbers(int[] digits) {
        boolean[] used = new boolean[digits.length];
        numbers(digits, "", used);
        return set.size();
    }

    public void numbers(int[] nums, String s, boolean[] used) {

        if (s.length() == 3) {
            if (s.charAt(0) != '0' &&
                (s.charAt(2) - '0') % 2 == 0) {

                set.add(Integer.parseInt(s));
            }
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (!used[i]) {
                used[i] = true;

                numbers(nums, s + nums[i], used);

                used[i] = false;
            }
        }
    }
}