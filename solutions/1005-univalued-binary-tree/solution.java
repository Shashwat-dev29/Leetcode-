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
    ArrayList <Integer>list=new ArrayList<>();
    public boolean isUnivalTree(TreeNode root) {
        traverse(root);
        for(int x=0;x<list.size()-1;x++)
        {
            if(list.get(x)!=list.get(x+1))
            {
                return false;
            }
        }
        return true;
        
    }
    private void traverse(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        list.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }

}
