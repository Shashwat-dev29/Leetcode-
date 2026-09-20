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
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        leafsum(root,false);
        return sum;
    }
    private void leafsum(TreeNode root, boolean flag)
    {
        if(root==null)
        {
            return;
        }
       if(root.left==null && root.right==null)
       {
         if(flag==true)
         {
            sum+=root.val;
         }
       }
       leafsum(root.left,true);
       leafsum(root.right,false);
    }
}