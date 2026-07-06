/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    HashMap<Integer,Integer>map=new HashMap<>();
    public int[] findMode(TreeNode root) {
       traverse(root);
       int max=0;
       for (int freq : map.values()) {
            if (freq > max) {
                max = freq;
            }
        }

        // Count how many modes there are
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                count++;
            }
        }

        // Store the modes
        int[] ans = new int[count];
        int i = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                ans[i++] = entry.getKey();
            }
        }
        return ans; 
    }
    private void traverse(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        if(map.get(root.val)==null)
        {
            map.put(root.val,1);
        }
        else
        {
        map.put(root.val,map.get(root.val)+1);
        }
        traverse(root.left);
        traverse(root.right);
    }
}
