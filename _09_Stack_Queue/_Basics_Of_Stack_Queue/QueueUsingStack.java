package _09_Stack_Queue._Basics_Of_Stack_Queue;

import java.util.Stack;

class Q {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enqueue(int x) {
        while (!s1.empty()) {
            s2.push(s1.peek());
            s1.pop();
        }
        s1.push(x);
        System.out.println(x + " is added");
        while (!s2.empty()) {
            s1.push(s2.peek());
            s2.pop();
        }
    }

    public int dequeue() {
        if (s1.isEmpty()) {
            System.out.print("Queue is empty ");
            return -1;
        }
        return s1.pop();
    }
    
    public int top() {
        if (s1.isEmpty()) {
            System.out.print("Queue is empty ");
            return -1;
        }
        return s1.peek();
    }
}

public class QueueUsingStack {
    public static void main(String[] args) {
        Q q = new Q();
        System.out.println(q.dequeue()+" is removed");
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("First element is "+q.top());
        System.out.println(q.dequeue()+" is removed");
        System.out.println("First element is "+q.top());
    }
}
