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
    List<Integer> map = new ArrayList<>();

    public List<Integer> largestValues(TreeNode root) {
        traverse(root, 0);
        return map;
    }

    private void traverse(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (map.size() <= level) {
            map.add(root.val);
        } else if (map.get(level) < root.val) {
            map.set(level,root.val);
        }
        traverse(root.left, level + 1);
        traverse(root.right, level + 1);
    }
}