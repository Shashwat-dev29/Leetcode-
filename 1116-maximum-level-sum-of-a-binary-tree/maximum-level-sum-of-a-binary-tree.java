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
    HashMap<Integer,Integer>map=new HashMap<>();
   
    int level=1;
    public int maxLevelSum(TreeNode root) {
        traverse(root);
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
    private void traverse(TreeNode root)
    {
        int sum=0;
        if(root==null)
        {
            // level--;
            return;
        }
       
        if(map.get(level)==null)
        {
            map.put(level,root.val);
        }
        else
        {
            // sum+=root.val;
            map.put(level,map.get(level)+root.val);
        }
        level++;
       traverse(root.left);
       
       traverse(root.right);
       level--;
    }
}