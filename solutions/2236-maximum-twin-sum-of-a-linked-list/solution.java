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
    public int pairSum(ListNode head) {
        // ListNode te=head;
        // ListNode hi=head;
        // int ans=0;
        // int c=1;
        // while(te.next!=null)
        // {
        //     te=te.next;
        //     c++;
        // }
        // for(int x=0;x<c/2;x++)
        // {
        //   int s=  sum(hi,x,c);
        //   if(s>ans)
        //   {
        //     ans=s;
        //   }
        //     hi=hi.next;
        // }
        // return ans;

        int ans=0;
        ListNode h=head;
        ListNode f=head;
        ListNode s=head;
        ListNode tf=null;
        while(f!=null && f.next!=null)
        {
            tf=s;
            f=f.next.next;
            s=s.next;
        }
        if (tf != null) {
            tf.next = null; 
        }
        ListNode prev = null;
        ListNode curr = s;
        while (curr != null) {
            ListNode nextNode = curr.next; 
            curr.next = prev;              
            prev = curr;                  
            curr = nextNode;               
        }
       if (tf != null) {
            tf.next = prev; 
        }

        while(prev!=null)
        {
            int sum=h.val+prev.val;
            if(sum>ans)
            {
                ans=sum;
            }
            prev=prev.next;
            h=h.next;

        }
        return ans;
    }
    // public int sum(ListNode he,int i ,int n)
    // {
    //     ListNode temp=he;
    //     int sum=0;
    //     if(i<n)
    //     {
    //     for(int x=i;x<n-i-1;x++)
    //     {
    //         temp=temp.next;

    //     }
    //     sum+=he.val+temp.val;
    //     }
    //     return sum;
    // }
}
