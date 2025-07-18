package _09_Stack_Queue._Basics_Of_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

class Stack {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.remove();
        }
        q1.add(x);
        System.out.println(x + " is pushed");
        while (!q2.isEmpty()) {
            q1.add(q2.peek());
            q2.remove();
        }
    }

    public int pop() {
        return q1.remove();
    }

    public int top() {
        if (q1.isEmpty()) {
            System.out.print("Stack is empty ");
            return -1;
        }
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}

public class StackUsingTwoQueue {
    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println("Top element is "+st.top());
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("Top element is "+st.top());
        System.out.println(st.pop()+" is poped");
        System.out.println("Top element is "+st.top());
    }
}
