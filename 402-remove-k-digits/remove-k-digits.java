// class Solution {
//     public String removeKdigits(String num, int k) {
//         Stack<Integer>stack=new Stack<>();
//         stack.push(Integer.parseInt(Character.toString(num.charAt(0))));
//         stack.push(Integer.parseInt(Character.toString(num.charAt(1))));
//         int count=0;
//         for(int x=2;x<num.length();x++)
//         {
//           if((Integer.parseInt(Character.toString(num.charAt(x)))<stack.peek())&&count<k)
//           {
//             stack.pop();
//             stack.push(Integer.parseInt(Character.toString(num.charAt(x))));
//             count++;
//           }
//         }
//         String str="";
//         for(int x=0;x<stack.size();x++)
//         {
//             str=Integer.toString(stack.pop())+str;
//         }
//         return str;
//     }
// }



class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> stack = new Stack<>();

        int count = 0;

        for (int x = 0; x < num.length(); x++) {
            int n = num.charAt(x) - '0';

            while (!stack.isEmpty() && n < stack.peek() && count < k) {
                stack.pop();
                count++;
            }

            stack.push(n);
        }

        while (count < k) {
            stack.pop();
            count++;
        }

        String str = "";

        while (!stack.isEmpty()) {
            str = stack.pop() + str;
        }

        str = str.replaceFirst("^0+", "");

        if (str.isEmpty()) {
            return "0";
        }

        return str;
    }
}