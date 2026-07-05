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
    public int countNodes(TreeNode root) {
    node(root) ;
      return sum; 
    }
    private void node(TreeNode root)
    {
        if(root==null)
        {
           return ;
        }
        sum++;
        node(root.left);
         node(root.right);
       
       
    }
}
