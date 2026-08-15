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
    public void reorderList(ListNode head) {
        reorder(head);
    }
    public void reorder(ListNode head)
    {
        ListNode t1=head;
        ListNode t2=head;
        while(t2!=null&&t2.next!=null)
        {
            t1=t1.next;
            t2=t2.next.next;
        }
        Deque<ListNode> stack = new ArrayDeque<>();
    ListNode current = t1.next;
    t1.next=null;
    while(current !=null)
    {
        stack.push(current);
        current = current.next;
    }
    ListNode h1=head;
     while (!stack.isEmpty()) {
        ListNode temp=h1.next;
        h1.next = stack.pop();
        h1.next.next=temp;
        h1=h1.next.next;
    }
    }
}