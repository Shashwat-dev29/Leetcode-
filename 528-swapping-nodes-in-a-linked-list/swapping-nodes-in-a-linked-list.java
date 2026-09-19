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
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        List<Integer>list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            list.add(temp.val);
            temp=temp.next;
        }
        temp=head;
        int a=list.size()-k;
        
        for(int x=0;x<list.size();x++)
        {
          if(x==k-1)
          {
            temp.val=list.get(a);
          }
          else if(x==a)
          {
            temp.val=list.get(k-1);
          }
          temp=temp.next;
        }
        return head;
    }
}