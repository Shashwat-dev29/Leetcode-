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
    String str="";
    ArrayList<String> list=new ArrayList();
    public int sumRootToLeaf(TreeNode root) {
      traverse(root,str);
      int sum=0;
      for(int x=0; x<list.size();x++)
      {
        int c=Integer.parseInt(list.get(x),2);
        sum+=c;
      }
      return sum;
    }
    private void traverse(TreeNode root,String str)
    {
        if(root==null)
        {
          return;
        }
        str+=Integer.toString (root.val);
        if(root.left == null && root.right == null)
        {
        list.add(str);
        return;
        }
       
            
        traverse(root.left,str);
        traverse(root.right,str);

    }
}
