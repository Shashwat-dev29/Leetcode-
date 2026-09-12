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
    int max=Integer.MIN_VALUE;
    int level=-1;
    public int findBottomLeftValue(TreeNode root) {
        traverse(root,0);
        return max;
    }
    public void traverse(TreeNode root,int cl)
    {
        if (root == null) {
            return;
        }
        if(root.left==null&&root.right==null)
        {
           
                if(cl>level)
                {
                max=root.val;
                level=cl;
                }
              
            return;
        }
         traverse(root.left,cl+1);
         traverse(root.right,cl+1);
       
    }
}