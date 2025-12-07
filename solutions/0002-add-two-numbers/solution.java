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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode();
         ListNode list3=head;
        int nxt=0;
        while (l1!=null||l2!=null)
        {
            int sum=nxt;
            if(l1!=null)
            {
               sum+=l1.val;
               l1=l1.next;
            }
            if(l2!=null)
            {
                sum+=l2.val;
                l2=l2.next;
            }
          nxt=sum/10;
          
          
          list3.next=new ListNode(sum%10);
          list3=list3.next;
        }
        if (nxt != 0) {
            list3.next = new ListNode(nxt);
        }
        return head.next;
    }
}
