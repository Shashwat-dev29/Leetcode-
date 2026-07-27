class MyCircularDeque {
    int size;
    int arr[];
    int front=0;
    int rear=0;
    int x=0;
    public MyCircularDeque(int k) {
        arr=new int[k];
        size=k;
    }
    
    public boolean insertFront(int value) {
        if(isFull())
        {
            return false;
        }
        front = (front - 1 + size) % size;
arr[front] = value;
x++;
       
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull())
        {
            return false;
        }
        arr[rear]=value;
        rear=(rear+1)%size;
        x++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty())
        {
            return false;
        }
       front=(front+1)%size;
        x--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty())
        {
            return false;
        }
        rear=(rear-1+size)%size;
        x--;
        return true;
    }
    
    public int getFront() {
      if(isEmpty())
      {
        return -1;
      }  
      return arr[front];
    }
    
    public int getRear() {
        if(isEmpty())
        {
            return -1;
        }
        return arr[(rear - 1 + size) % size];
    }
    
    public boolean isEmpty() {
        if(x==0)
        {
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if(x==size)
        {
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */