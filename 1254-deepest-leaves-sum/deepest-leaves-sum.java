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
    int max=0;
    public int deepestLeavesSum(TreeNode root) {
        traverse(root,0);
        return sum;
    }
    private void traverse(TreeNode root,int level)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null&&root.right==null)
        {
            if(level>max)
            {
                sum=root.val;
                max=level;
            }
            else if(level==max)
            {
              sum+=root.val;
            }
        }
        traverse(root.left,level+1);
        traverse(root.right,level+1);
    }
}