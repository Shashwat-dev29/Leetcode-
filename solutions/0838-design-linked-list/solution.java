class MyLinkedList {

   class Node {
        int val;
        Node next;

        Node() {}

        Node(int val) {
            this.val = val;
        }

        Node(Node next, int val) {
            this.next = next;
            this.val = val;
        }
    }

    Node head;  

    public MyLinkedList() {
        head = null;
    }
    
        
    
    
    public int get(int index) {
       Node temp=head;
        int count=0;
        
        while(temp!=null)
        {
             if(count==index)
            {
                return temp.val;
            }
            count++;
            temp=temp.next;
        }
        return -1;
        
    }
    
    public void addAtHead(int val) {
        Node h1=new Node();
        h1.val=val;
        h1.next=head;
        head=h1;
        
    }
    
    public void addAtTail(int val) {
        Node temp=head;
        Node t1=new Node();
        t1.val=val;
        if(head==null)
        {
            head=t1;
            return;
        }
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=t1;
        t1.next=null;
        
    }
    
    public void addAtIndex(int index, int val) {
         if (index == 0) {          
        addAtHead(val);
        return;
    }
        Node temp=head;
        Node i1=new Node();
        int count=0;
        i1.val=val;
        while(temp!=null)
        {
            if(count==index-1)
            {
                break;
            }
            count++;
            temp=temp.next;
            
        }
        if(temp==null){return;}
        i1.next=temp.next;
        temp.next=i1;
        
    }
    
    public void deleteAtIndex(int index) {
         if(head==null)
        {
            return ;
        }
         if (index == 0) {         
        head = head.next;
        return;
         }
        Node temp=head;
        // MyLinkedList i1=new Node;
        int count=0;
        // i1.val=val;
        while(temp!=null)
        {
             if(count==index-1)
            {
                break;
            }
            count++;
            temp=temp.next;
           
        }
        if (temp==null||temp.next == null) return;
        temp.next=temp.next.next;
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
