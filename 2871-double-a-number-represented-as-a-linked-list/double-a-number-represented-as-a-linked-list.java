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
    Stack<Integer>stack=new Stack<>();
    Stack<Integer>stack1=new Stack<>();
    public ListNode doubleIt(ListNode head) {
        traverse(head);
        ListNode temp1 = head;
        ListNode temp2 = head;
        ListNode prev = null;

        while (!stack1.isEmpty()) {
            if (temp1 == null) {
                temp1 = new ListNode(stack1.pop());
                prev.next = temp1;
            } else {
                temp1.val = stack1.pop();
            }

            prev = temp1;
            temp1 = temp1.next;
        }

        return head;
    }
    public void traverse(ListNode head)
    {
        ListNode temp=head;
        while(temp!=null)
        {
            stack.push(temp.val);
            temp=temp.next;
        }
        int carry=0;
    
        while(!stack.isEmpty())
        {
            int n=(stack.pop()*2)+carry;
           
                stack1.push(n%10);
                carry=n/10;
            
        }
        if (carry > 0) {
            stack1.push(carry);
        }

      
        
    }
}