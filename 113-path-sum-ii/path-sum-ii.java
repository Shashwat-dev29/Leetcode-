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
    List<List<Integer>>list1=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer>list=new ArrayList<>();
        
        traverse(root,0,targetSum,list);
        return list1;
    }
    public void traverse(TreeNode root,int sum,int tsum,List<Integer>list)
    {
      if(root==null)
      {
        return;
      }
    //   sum+=root.val;
    //   if(sum>tsum)
    //   {
    //     return;
    //   }
    //   else
    //   {
    //    list.add(root.val);
    //   }
     sum += root.val;
        list.add(root.val);

        if (root.left == null && root.right == null) {
            if (sum == tsum) {
                list1.add(new ArrayList<>(list));
            }
            list.remove(list.size() - 1);
            return;
        }
      traverse(root.left,sum,tsum,list);
      traverse(root.right,sum,tsum,list);
      list.remove(list.size() - 1);
    }
}