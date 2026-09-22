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
    List<Integer>list=new ArrayList<>();
    public int findTilt(TreeNode root) {
        traverse(root,0);
        int sum=0;
       for(int x=0;x<list.size();x++)
       {
        sum+=list.get(x);
       }
       return sum;
    }
    private int traverse(TreeNode root,int sum)
    {
        if(root==null)
        {
            return 0;
        }
       
         int left=traverse(root.left,sum);
         int right=traverse(root.right,sum); 
        int x= (int)Math.abs(left-right);
        list.add(x);
         sum+=root.val+left+right;
        return sum;
    }
}