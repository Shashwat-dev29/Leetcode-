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
    int max=0;
    public int maxDepth(TreeNode root) {
        traversal(root,0);
        return max;
    }
    private void traversal(TreeNode root,int deapth)
    {
        if(root==null)
        {
            return;
        }
        deapth++;
        if(root.left==null&& root.right==null)
        {
            if(deapth>max)
            {
                max=deapth;
            }
            return;
        }
        traversal(root.left,deapth);
        traversal(root.right,deapth);
        deapth--;
    }
}
