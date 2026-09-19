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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode t1=list2;
        ListNode t2=list2;
        ListNode temp1=list1;
        ListNode temp2=list1;
        int x=0;
        int y=0;

        while(t2.next!=null)
        {
            t2=t2.next;
        }
        while(temp2!=null)
        {
            if(y==b)
            {
                break;
            }
            temp2=temp2.next;
            y++;
        }
        while(temp1!=null)
        {
            if(x<a-1)
            {
                temp1=temp1.next;
            }
            if(x==a-1)
            {
                temp1.next=t1;
            }
            if(x==b)
            {
                t2.next=temp2.next;
                break;
            }
            x++;
        }
        return list1;
    }
}