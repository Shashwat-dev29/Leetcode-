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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        ListNode shift=head;
       if (n == count) return head.next;

        for(int x=0;x<count;x++)
        {
            if(x==count-n-1)
            {
              shift.next=shift.next.next;
              break;
            }
            shift=shift.next;
        }
        return head;
    }
    
}
