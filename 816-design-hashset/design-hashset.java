class MyHashSet {
    ArrayList<Integer>list=new ArrayList<>();
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        if(list.contains(key)==true)
        {
            return;
        }
        list.add(key);
    }
    
    public void remove(int key) {
        if( contains(key)==false)
        {
            return;
        }
        for(int x=0;x<list.size();x++)
        {
            if(list.get(x)==key)
            {
               list.remove(x);
            }
        }
        
    }
    
    public boolean contains(int key) {
      return list.contains(key);  
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */