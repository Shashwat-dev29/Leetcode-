/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        if(head == null)
            return null;
       HashMap<Node,Node>map=new HashMap<>();
        Node temp=head;
        Node copy;
        
         while(temp != null)
        {
            copy = new Node(temp.val);
            map.put(temp, copy);

            temp = temp.next;
        }
        temp = head;
        while(temp!=null)
        {
           
           copy = map.get(temp);

            copy.next = map.get(temp.next);
            copy.random = map.get(temp.random);

            temp = temp.next;
        //   copy.next=new Node(temp.val);
        // copy.random = map.get(temp.random);
        //   temp=temp.next;
        //   copy=copy.next;
        }
        return map.get(head);
    }
}