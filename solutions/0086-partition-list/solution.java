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
    public ListNode partition(ListNode head, int x) {
        if(head == null)
       {
          return null;
       }
        ListNode te=head;
        ListNode temp=new ListNode();
        ListNode te1=new ListNode();
        ListNode te2=te1;
        ListNode te3=temp;

       while(te!=null)
       {
        if(te.val<x)
        {
            
            temp.next=new ListNode();
            temp=temp.next;
            temp.val=te.val;
        }
        else 
        {
           
            te1.next=new ListNode();
            te1=te1.next;
            te1.val=te.val;
        }
        te=te.next;
       }
       temp.next=te2.next;

        return te3.next;
    }
}
