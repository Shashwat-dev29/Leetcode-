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
//     public ListNode modifiedList(int[] nums, ListNode head) {
        
//         for(int x=0;x<nums.length;x++)
//         {
//             ListNode temp=head;
//         ListNode prev=null;
//             while(temp!=null)
//             {
//                 if(temp.val==nums[x])
//                 {
//                      if(prev == null)
//                     {
//                         head = temp.next;
//                         temp = head;
//                     }
//                     else
//                     {
//                         prev.next = temp.next;
//                         temp = temp.next;
//                     }

//                 }
//                else
//                {
//                  prev=temp;
//                  temp=temp.next;
//                }
//             }
//         }
//         return head;
//     }
// }



class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {

        HashSet<Integer> set = new HashSet<>();

        for(int x = 0; x < nums.length; x++)
        {
            set.add(nums[x]);
        }

        ListNode temp = head;
        ListNode prev = null;

        while(temp != null)
        {
            if(set.contains(temp.val))
            {
                if(prev == null)
                {
                    head = temp.next;
                    temp = head;
                }
                else
                {
                    prev.next = temp.next;
                    temp = temp.next;
                }
            }
            else
            {
                prev = temp;
                temp = temp.next;
            }
        }

        return head;
    }
}