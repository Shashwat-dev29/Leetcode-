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
     List<String>str=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
       
        // st.add(String.valueOf(root.val));
        path(root,"");
       return str;

    }
    public void path(TreeNode root,String st)
    {
        if(root==null)
        {
            return;
        }
        
       if(st.length()!=0)
       {
         st+="->"+root.val;
       }
       else
       {
         st+=root.val;
       }
       if(root.left!=null)
       {
            path(root.left,st);
       }
       if(root.right!=null)
       {     
          path(root.right,st);
        
       }
       if(root.left==null&&root.right==null)
       {
        
        str.add(st);
       }
    //    return st;
    }
}
