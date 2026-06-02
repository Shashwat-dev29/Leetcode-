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
    public ListNode swapPairs(ListNode head) {
         if(head==null||head.next==null)
         {
            return head;
         }
         ListNode temp=head;
        
            ListNode ny=temp;
            ListNode ny1=temp.next;
            
            ny.next=swapPairs(temp.next.next);
            ny1.next=ny;
        
       return ny1;
    }
}
