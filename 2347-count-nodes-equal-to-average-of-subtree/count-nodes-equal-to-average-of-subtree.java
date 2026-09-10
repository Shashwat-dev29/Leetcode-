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
    int count=0;
    public int averageOfSubtree(TreeNode root) {
        traverse(root);
       return count;
    }
    public int[] traverse(TreeNode tr)
    {
        if(tr==null)
        {
        //     sum+=tr.val;
        //     x++;
        //     return;
        return new int[]{0, 0};
        }
    
        // sum+=tr.val;
        int[] left = traverse(tr.left);
        int[] right = traverse(tr.right);

        int sum = tr.val + left[0] + right[0];
        int x = 1 + left[1] + right[1];
        // traverse(tr.left,sum,x);
        // traverse(tr.right,sum,x);
        // x++;
        if(tr.val==sum/x)
        {
            count++;
        }
         return new int[]{sum, x};
    }
}