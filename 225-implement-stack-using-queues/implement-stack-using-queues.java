class MyStack {

    Queue<Integer> qstk = new LinkedList<>();
    int cSize=-1;
    public MyStack() {
        
    }
    
    public void push(int x) {
        qstk.add(x);
        cSize++;
        int tem = cSize;
        while(tem>0)
        {
            int temp = qstk.remove();
            qstk.add(temp);
            tem--;
        }
    }
    
    public int pop() {
        int ans = qstk.peek();
        qstk.remove();
        cSize--;
        return ans;
    }
    
    public int top() {
        return qstk.peek();
    }
    
    public boolean empty() {
        if(cSize<0)return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */