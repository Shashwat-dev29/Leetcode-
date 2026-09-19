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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp=head;
        int len=0;
        ListNode ans[]=new ListNode[k];
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }
        int plen=0;
        int extra=0;
        if(len>=k)
        {
            plen=len/k;
            extra=len%k;
        }
        else
        {
            plen=1;
        }
        int orig=plen;
        int ct=0;
        int cp=1;
        int x=1;
        temp=head;
        ans[0]=temp;
        while(temp!=null)
        {
            if(x==k)
            {
                break;
            }
            if(extra!=0 && ct==0)
            {
                plen=plen+1;
                extra=extra-1;
                ct=1;
            }
            else if(extra==0 && ct==0)
            {
              plen=orig;
            }
            if(cp<plen)
            {
                temp=temp.next;
                cp++;
            }
            else if(cp==plen)
            {
                ListNode next=temp.next;
                temp.next=null;
                temp=next;
                cp++;
            }
            else if(cp==plen+1)
            {
                ans[x]=temp;
                plen=orig;
                ct=0;
                x++;
                cp=1;
            }
        }
        return ans;
    }
}