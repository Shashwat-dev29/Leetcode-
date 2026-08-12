class MyCalendar {
     ArrayList <Integer> st=new ArrayList<>();
     ArrayList<Integer> et=new ArrayList<>();
     int x=0;
    public MyCalendar() {

        
    }
    
    public boolean book(int startTime, int endTime) {
        if(x==0)
        {
            st.add(startTime);
            et.add(endTime);
            x++;
            return true;

        }
        for( int a=0;a<x;a++)
        {
            if((startTime>=st.get(a)&&startTime<et.get(a))||(endTime>st.get(a)&&endTime<=et.get(a))||(startTime<st.get(a)&&endTime>et.get(a)))
            {
                return false;
            }
        }
        st.add(startTime);
        et.add(endTime);
        x++;
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */