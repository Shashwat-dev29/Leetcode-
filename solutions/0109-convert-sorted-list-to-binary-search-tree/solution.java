/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    TreeNode root=null;
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)
        {
            return null;
        }
        int len=length(head,null);
        build(head,len);
        
        return root;
    }
    public void build(ListNode start,int len)
    {
        int c=0;
        ListNode start1=start;
        if(len<=0)
        {
            return;
        }
        while(c<len/2)
        {
          start1=start1.next;
          c++;
        }
      root=insert(start1.val,root);
      build(start,len/2);
      build(start1.next,len-(len/2)-1);
    }
    public int length(ListNode s,ListNode e)
    {
        int count=1;
      while(s.next != e)
      {
        count++;
        s=s.next;
      }
      return count;
    }
    public TreeNode insert(int value,TreeNode node)
    {
        if(node==null)
        {
            return new TreeNode(value);
        }
        else if(value<node.val)
        {
            node.left=insert(value,node.left);
        }
        else
        {
            node.right=insert(value,node.right);
        }
        return node;
    }
}
