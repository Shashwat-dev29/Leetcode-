class MinStack {
   int x=0;
   ArrayList<Integer>list=new ArrayList<>();
   ArrayList<Integer>list1=new ArrayList<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
        list.add(value);
        if(list1.isEmpty())
        {
            list1.add(value);
        }
        else if(value<list1.get(x-1))
        {
            list1.add(value);
        }
        else
        {
            list1.add(list1.get(x-1));
        }
        x++;
    }
    
    public void pop() {
        list.remove(x-1);
        list1.remove(x-1);
        x--;
    }
    
    public int top() {
       return list.get(x-1);
    }
    
    public int getMin() {
      return list1.get(x-1);
       
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
