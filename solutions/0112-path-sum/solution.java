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
        boolean flag=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
       pathSum(root,targetSum);
       return flag;
    }

    // private boolean hasPathSum(TreeNode root)
    // {
    //     int s=root.val;
    //      while(root.left!=null)
    //     {
    //         su=root.val+hasPathSum(root.left);
    //     }
    //      if(su==targetSum)
    //     {
    //         return true;
    //     }
    //     while(root.right!=null)
    //     {
    //         su=root.val+hasPathSum(root.right);
    //     }
    //     if(su==targetSum)
    //     {
    //         return true;
    //     }
    //     return false;
       
    // }
    private void pathSum(TreeNode root,int target)
    {
        if(root==null)
        {
            return;
        }
         sum+=root.val;
         if (root.left==null && root.right==null)
      {
        if(sum==target)
        {
        flag=true;
        }
        sum -= root.val; 
        return;
        
      }
       
    //   if((root.left==null&&root.right==null))
    //   {
    //     return;
    //   }
    
    //    if(root.left!=null&&((sum+root.left.val)<target))
    //   {
    //     sum+=root.left.val;
        pathSum(root.left,target);
    //   }
    //   sum=sum-root.val;
    //   if(root.right!=null&&((sum+root.right.val)<target))
    //   {
    //     sum+=root.val;
        pathSum(root.right,target);
    //   }
     sum=sum-root.val;
    }
}
