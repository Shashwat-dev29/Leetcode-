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
    int min=Integer.MAX_VALUE;
    List<Integer>list=new ArrayList<>();
    
    public int getMinimumDifference(TreeNode root) {
        traverse (root);
        for(int x=0;x<list.size()-1;x++)
        {
            int dif=list.get(x+1)-list.get(x);
            if(dif<min)
            {
                min=dif;
            }
        }
        return min;

    }
    private void traverse(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        traverse(root.left);
    //    if(root.left!=null)
    //    {
    //     int dif=root.val-root.left.val;
    //     min=Math.min(min,dif);
    //    }
    //     if(root.right!=null)
    //    {
    //     int dif=root.right.val-root.val;
    //     min=Math.min(min,dif);
    //    }
    //     if(root.left!=null&&root.right!=null)
    //    {
    //     int dif=root.right.val-root.left.val;
    //     min=Math.min(min,dif);
    //    }
       list.add(root.val);
       traverse(root.right);
    }
}