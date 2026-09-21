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
    HashMap<Integer, Integer> map = new HashMap<>();
    int max = 0;

    public int[] findFrequentTreeSum(TreeNode root) {
        traverse(root);

        ArrayList<Integer> list = new ArrayList<>();

        for(int x : map.keySet())
        {
            if(map.get(x) == max)
            {
                list.add(x);
            }
        }

        int[] ans = new int[list.size()];

        for(int x = 0; x < list.size(); x++)
        {
            ans[x] = list.get(x);
        }

        return ans;
    }

    private int traverse(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }

        int left = traverse(root.left);
        int right = traverse(root.right);

        int sum = root.val + left + right;

        if(map.containsKey(sum))
        {
            map.put(sum, map.get(sum) + 1);
        }
        else
        {
            map.put(sum, 1);
        }

        max = Math.max(max, map.get(sum));

        return sum;
    }
}