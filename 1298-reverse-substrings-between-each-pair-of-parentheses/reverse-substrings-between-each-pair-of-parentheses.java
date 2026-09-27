class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(str);
                str = new StringBuilder();
            }
            else if (ch == ')') {
                str.reverse();
                StringBuilder temp = stack.pop();
                temp.append(str);
                str = temp;
            }
            else {
                str.append(ch);
            }
        }

        return str.toString();
    }
}