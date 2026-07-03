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
    TreeNode root = null;
    public TreeNode sortedArrayToBST(int[] nums) {
      
      build(nums,0,nums.length-1);
      return root;
        
    }
    public void build(int nums[],int start,int end)
   {
     if(start>end)
     {
        return;
     }
     int mid=start+(end-start)/2;
     root=insert(nums[mid],root);
     build(nums,start,mid-1);
     build(nums,mid+1,end);
   }
   private TreeNode insert(int value,TreeNode node)
   {
    if(node==null)
    {
        return new TreeNode(value);
    }
    else if(value<node.val)
    {
       node.left= insert(value,node.left);
    }
    else{
      node.right= insert(value,node.right) ;
    }
    return node;
   }
}
