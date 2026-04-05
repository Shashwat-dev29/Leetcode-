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
    public ListNode oddEvenList(ListNode head) {
         if (head == null) return null; 
        ListNode temp=head;
        ListNode remp=head.next;
        ListNode ne=new ListNode();
         ListNode ne1=ne;

        while(temp!=null)
        {
           ne.val=temp.val;
           
           if(temp.next!=null&&temp.next.next != null)
           {
            ne.next= new ListNode();
           ne=ne.next;
           }
           if(temp.next!=null)
           {
           temp=temp.next.next;
           }
           else
           {
            temp=null;
           }
        }
         if (remp != null) {
            ne.next = new ListNode();
            ne = ne.next;
        }

         while(remp!=null)
        {
           ne.val=remp.val;
           if(remp.next!=null&&remp.next.next != null)
           {
           ne.next= new ListNode();
           ne=ne.next;
           }
            if(remp.next!=null)
           {
           remp=remp.next.next;
           }
           else
           {
            remp=null;
           }
        }
       return ne1 ;
    }
}
