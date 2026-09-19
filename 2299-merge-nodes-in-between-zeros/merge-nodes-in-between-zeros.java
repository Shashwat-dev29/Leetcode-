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
    public ListNode mergeNodes(ListNode head) {
        List<Integer>list=new ArrayList<>();
        ListNode temp=head;
        int sum=0;
        int a=0;
        while(temp!=null)
        {
            if(temp.val==0&&a==0)
            {
                temp=temp.next;
                a=1;
                continue;
            }
            if(temp.val==0&&a!=0)
            {
                list.add(sum);
                sum=0;
            }
            else
            {
                sum+=temp.val;
            }
            temp=temp.next;
        }
        ListNode clone=new ListNode(list.get(0));
        ListNode c1=clone;
        for(int x=1;x<list.size();x++)
        {
            clone.next=new ListNode(list.get(x));
            clone=clone.next;
        }
        return c1;
    }
}