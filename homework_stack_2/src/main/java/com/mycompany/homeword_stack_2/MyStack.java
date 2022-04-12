package com.mycompany.homeword_stack_2;

import java.util.Stack;

/**
 *
 * @author Washington Yandun @WashingtonYandun
 */
public class MyStack {
    Stack stk;
    int maxSize;


    public MyStack(int maxSize) {
        stk = new Stack<Box>();
        this.maxSize = maxSize; // 6 is default size
    }
    
    public boolean isEmpty(){
        return this.stk.empty();
    }
    
    public void push(Box box){
        this.stk.push(box);
    }
    
    public Box pop(){
        return (Box)this.stk.pop();
    }
    
    public Box peek(){
        return (Box)this.stk.peek();
    }
    
    public int size(){
        return this.stk.size();
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = this.size() - 1; i >= 0 ; i--) {
            result += this.stk.get(i) + "\n";
        }
        return result;
    }
    
}