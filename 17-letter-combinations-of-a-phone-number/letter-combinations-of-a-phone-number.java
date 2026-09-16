import java.util.ArrayList;
import java.util.List;

class Solution {
    // Array mapping for phone keypad digits 2-9 to their corresponding letters
    private static final String[] KEYPAD = {
        "",     // 0 (not used)
        "",     // 1 (not used)
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        
        // Edge case: if the input is empty, return an empty list
        if (digits == null || digits.isEmpty()) {
            return result;
        }
        
        // Start the recursive backtracking helper
        backtrack(result, digits, new StringBuilder(), 0);
        return result;
    }

    private void backtrack(List<String> result, String digits, StringBuilder currentCombination, int index) {
        // Base case: if the current combination length matches the input digits length, we found a valid combination
        if (index == digits.length()) {
            result.add(currentCombination.toString());
            return;
        }

        // Get the letters corresponding to the current digit
        char digit = digits.charAt(index);
        String letters = KEYPAD[digit - '0'];

        // Loop through all letters mapped to the current digit
        for (int i = 0; i < letters.length(); i++) {
            // Choose: add the character to the current combination
            currentCombination.append(letters.charAt(i));
            
            // Explore: move to the next digit
            backtrack(result, digits, currentCombination, index + 1);
            
            // Unchoose: backtrack by removing the last added character
            currentCombination.deleteCharAt(currentCombination.length() - 1);
        }
    }
}
