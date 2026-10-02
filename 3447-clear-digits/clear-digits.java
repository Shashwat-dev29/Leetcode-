class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack= new Stack<>();
        for(int x=0;x<s.length();x++)
        {
            if(!Character.isDigit(s.charAt(x)))
            {
                stack.push(s.charAt(x));
            }
            else if(!stack.isEmpty())
            {
                stack.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
          return sb.reverse().toString();

    }
}