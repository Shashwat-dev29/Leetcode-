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
    ArrayList<Integer> list=new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1==null||root2==null)
        {
            return false;
        }
        ArrayList<Integer> b=new ArrayList<>();
        a(root1);
        b.addAll(list);
        list.clear();
        a(root2);
        if (list.size() != b.size()) {
    return false;
}
        for(int x=0;x<list.size();x++)
        {
            if(list.get(x).intValue()!=b.get(x).intValue())
            {
                return false;
            }
        }
        return true;
    }
    private void a(TreeNode root)
    {
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null)
        {
          list.add(root.val);
          return;
        }
        a(root.left);
        a(root.right);
      
    }
}
