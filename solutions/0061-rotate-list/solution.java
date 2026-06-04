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
    int x=0;
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null|| head.next == null)
        {
            return head;
        }
       int length=1;
       ListNode he1=head;
       ListNode he=head;
       while(he.next.next!=null)
       {
        he=he.next;
        length++;
       } 
       length++;
       if(x<k%length)
       {
        ListNode h1=head;
         h1=he.next;
         h1.next=head;
         he.next=null;
          x++;
         he1= rotateRight( h1, k);
        

       }
       return he1;
    }
}
