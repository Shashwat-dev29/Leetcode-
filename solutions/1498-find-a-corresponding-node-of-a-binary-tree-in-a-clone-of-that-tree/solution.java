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
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        traversal(original,cloned,target);
        return node;
    }
    private void traversal(TreeNode original,TreeNode cloned,TreeNode target)
    {
        if(original==null && target==null)
        {
            return;
        }
       if(original==target)
        {
          
          node=cloned;
        }
        if(original.left!=null)
        {
        traversal(original.left,cloned.left,target);
        }
        if(original.right!=null)
        {
        traversal(original.right,cloned.right,target);
        }
    }
}
