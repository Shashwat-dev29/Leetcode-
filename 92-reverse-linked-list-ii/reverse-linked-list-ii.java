// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode reverseBetween(ListNode head, int left, int right) {
//         ListNode temp=head;
//           ListNode pre = null;
//        ListNode t1 = null;
// ListNode t2 = null;
// ListNode t3 = null;
// ListNode t4 = null;
//         int count=1;
//         while(count<=right)
//         {
//             if(count==left)
//             {
//                 t2=temp;
//                 t1=pre;
//                 //  if(t1 != null)
//                 // {
//                 //     t1.next = null;
//                 // }
                
//             }
//             if(count==right)
//             {
//                 t3=temp;
//                 t4=temp.next;
                
//             }
//              pre = temp;   
//             temp=temp.next;
//             count++;
//         }
//         ListNode prev = null;   // Tracks the previous node
//     ListNode curr = t2;   // Tracks the current node being processed
    
//     while (curr != t4) {
//         ListNode nextNode = curr.next; 
//         curr.next = prev;             
//         prev = curr;                  
//         curr = nextNode; 
//     }             
   
      

    
//     //  while(prev.next!=null)
//     //  {
//     //     prev=prev.next;
//     //  }

//      if(t1 != null)
//         {
//             t1.next = prev;
//         }
//         else
//         {
//             head = prev;
//         }
//      prev.next=t4;
//      return head;
//     }
// }





class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = head;
        ListNode pre = null;

        ListNode t1 = null;
        ListNode t2 = null;
        ListNode t4 = null;

        int count = 1;

        while(count <= right)
        {
            if(count == left)
            {
                t2 = temp;
                t1 = pre;
            }

            if(count == right)
            {
                t4 = temp.next;
            }

            pre = temp;
            temp = temp.next;
            count++;
        }

        ListNode prev = null;
        ListNode curr = t2;

        while(curr != t4)
        {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        if(t1 != null)
        {
            t1.next = prev;
        }
        else
        {
            head = prev;
        }

        t2.next = t4;

        return head;
    }
}