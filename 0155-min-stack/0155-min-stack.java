class MinStack {
    int[] stack;
    int ptr;
    int min;

    public MinStack() {
        stack = new int[10000];
        ptr=-1;
        min=Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(ptr!=stack.length-1){
            stack[++ptr]=val;
        }
        if(val<min){
            min=val;
        }
        
    }
    
    public void pop() {
        if(stack[ptr--]==min){
            min=Integer.MAX_VALUE;
            for(int i = 0;i<=ptr;i++){
                min=Math.min(stack[i],min);
            }
        }
        
    }
    
    public int top() {
        if(ptr!=-1){
        return stack[ptr];
        }
        else{
            return 0;
        }
        
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */