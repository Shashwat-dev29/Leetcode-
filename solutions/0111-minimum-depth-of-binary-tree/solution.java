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
    
    public int minDepth(TreeNode root) {
       return Deapth(root);

        
    }
    private int Deapth(TreeNode root)
    {
      int left=Integer.MAX_VALUE;
    int right=Integer.MAX_VALUE;
    if(root==null)
    {
        return 0;
    }
    if (root.left == null && root.right == null)
           {
             return 1;
           }
        if(root.left!=null)
        {
         
         left= Deapth(root.left);
        }
        if(root.right!=null)
        {
            right= Deapth(root.right);
        }
       return Math.min(left,right)+1;
    }
}
