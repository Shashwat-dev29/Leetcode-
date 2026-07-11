/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode node;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        traverse(root,p,q);
        return node;
    }
    public void traverse(TreeNode root, TreeNode p, TreeNode q)
    {
             if(root==null)
             {
             return;
             }
        
            if((p.val<root.val)&&(q.val<root.val))
            {
                traverse(root.left,p,q);
            }
            else if((p.val>root.val)&&(q.val>root.val))
            {
              traverse(root.right,p,q);
            }
            else
            {
               node=root;
            }
    }
}