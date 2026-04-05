/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
       ListNode temp=node;
       if(temp.next==null) 
       {
        temp=null;
       }
       else
       {
        temp.val=temp.next.val;
        if(temp.next.next==null)
        {
            temp.next=null;
        }
        else
        {
        temp.next=temp.next.next;
        }
       }
    }
}
