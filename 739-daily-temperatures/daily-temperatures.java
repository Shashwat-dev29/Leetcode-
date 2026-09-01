class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int arr[]=new int[temperatures.length];
        // for(int x=0;x<temperatures.length;x++)
        // {
        //     arr[x]=-1;
        // }
        Deque<Integer> stack = new ArrayDeque<>();
        // stack.push(0);
       
        for(int x=0;x<temperatures.length;x++)
        {
        while(!stack.isEmpty() && temperatures[x]>temperatures[stack.peek()])
        {
           int y= stack.pop();
            arr[y]=x-y;
           
        }
         stack.push(x);
        }
        return arr;
    }
}