class Solution {
    public String makeGood(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> stack= new Stack<>();
        for(int x=0;x<s.length();x++)
        {
            if(stack.isEmpty())
            {
                stack.push(s.charAt(x));
                continue;
            }
            if(((s.charAt(x)==Character.toUpperCase(stack.peek()))||(s.charAt(x)==Character.toLowerCase(stack.peek())))&&( s.charAt(x) != stack.peek()))
            {
               stack.pop(); 
            }
            else
            {
                stack.push(s.charAt(x));
            }
        }
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}