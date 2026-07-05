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
    int ans;
    public boolean evaluateTree(TreeNode root) {
        ans=solve(root);
        if(ans==1)
        {
        return true;
        }
        return false;
    }
    private int solve(TreeNode root)
    {
       if(root.val==0||root.val==1)
       {
        return root.val;
       }
       if(root.val==3)
       {
        if(solve(root.left)==1 &&solve(root.right)==1)
         ans=1 ;
         else
         ans=0;
       }
       else if( root.val==2)
       {
         if(solve(root.left)==1||solve(root.right)==1)
         ans=1 ;
         else
         ans=0;
       }
       
      return ans;
    }
}
