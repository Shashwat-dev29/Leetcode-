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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null)
        {
            return head;
        }
        if(head.next==null)
        {
            return head.next;
        }
        ListNode fast=head;
        ListNode slow=head;
        ListNode temp=null;
        while(fast!=null && fast.next!=null)
        {
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        // while(temp.next!=slow)
        // {
        //     temp=temp.next;
        // }
        temp.next=temp.next.next;
        return head;
    }
}
