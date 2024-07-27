package leetcode.contest;

import java.util.Stack;

public class QueueStak {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public QueueStak() {
        stack1 =  new Stack<>();
        stack2 = new Stack<>();
    }

    public void fillStack(Stack<Integer> stak1,Stack<Integer> stak2){
        while(!stak1.isEmpty()){
            System.out.println("I am the culprit");
            stak2.push(stak1.pop());
        }
    }

    public void push(int x) {
        fillStack(stack1, stack2);
        stack1.push(x);
        fillStack(stack2, stack1);
    }

    public int pop() {
        if(!empty()){
            return stack1.pop();
        }
        return -1;
    }

    public int peek() {
        if(!empty()){
            return stack1.peek();
        }
        return -1;
    }

    public boolean empty() {
        return stack1.isEmpty();
    }

    public static void main(String[] args) {
        QueueStak q = new QueueStak();
        q.push(1);
        q.push(2);
        System.out.println(q.peek()+" "+ q.pop()+" "+ q.empty());
    }
}

