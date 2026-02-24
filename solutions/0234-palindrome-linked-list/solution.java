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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        boolean flag =true;
        ArrayList<Integer> ar=new ArrayList();
        while(temp!=null)
        {
        ar.add(temp.val);
        temp=temp.next;
        }
        
        int c=ar.size()-1;
        int mid=(c+1)/2;
        for(int x=0;x<mid;x++)
        {
            if(ar.get(x)!=ar.get(c))
            {
                flag=false;
                break;
            }
            c--;
        }
        return flag;
       
    }
}
