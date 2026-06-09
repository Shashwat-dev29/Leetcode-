import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        
        // Handle edge case: empty array
        if (nums == null || nums.length == 0) {
            return list;
        }
        
        for (int i = 0; i < nums.length; i++) {
            // Mark the start of the current range
            int start = nums[i];
            
            // Keep advancing 'i' as long as the numbers are consecutive
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            
            // If the start is different from nums[i], we found a range
            if (start != nums[i]) {
                list.add(start + "->" + nums[i]);
            } else {
                // Otherwise, it's just a single, standalone number
                list.add(String.valueOf(start));
            }
        }
        
        return list;
    }
}
