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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        String s="";
        while(temp!=null)
        {
           s+=temp.val;
           temp=temp.next; 
        }
        int i=0;
        for(int x=s.length();x>0;x--)
        {
            if(s.charAt(x-1)=='1')
            {
                i+=Math.pow(2,(s.length()-x));
            }
        }
        return i;
    }
}