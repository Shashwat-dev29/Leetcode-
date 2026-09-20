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
    List<Double>sum=new ArrayList<>();
    List<Double>num=new ArrayList<>();
    public List<Double> averageOfLevels(TreeNode root) {
       traverse(root,0);
       for(int x=0;x<sum.size();x++)
       {
        sum.set(x,sum.get(x)/num.get(x));
       } 
       return sum;
    }
    private void traverse(TreeNode root,int level)
    {
        if(root==null)
        {
            return;
        }
        if(level>=sum.size())
        {
            sum.add(root.val+0.0);
            num.add(1.0);
        }
        else
        {
            sum.set(level,sum.get(level)+root.val);
            num.set(level,num.get(level)+1);
        }
        traverse(root.left,level+1);
        traverse(root.right,level+1);
    }
}