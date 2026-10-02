class Solution {
    List<String> list = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        generate("", 0, 0, n);
        return list;
    }

    public void generate(String s, int open, int close, int n) {
        if (open == n && close == n) {
            list.add(s);
            return;
        }

        if (open < n) {
            generate(s + "(", open + 1, close, n);
        }

        if (close < open) {
            generate(s + ")", open, close + 1, n);
        }
    }
}