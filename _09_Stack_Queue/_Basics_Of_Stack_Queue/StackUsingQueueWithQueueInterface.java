package _09_Stack_Queue._Basics_Of_Stack_Queue;

import java.util.Queue;
import java.util.LinkedList;

public class StackUsingQueueWithQueueInterface {
    static Queue<Integer> q = new LinkedList<>();

    public static void push(int x) {
        int size = q.size();
        q.add(x);
        System.out.println(x + " is added");
        for (int i = 0; i < size; i++) {
            q.add(q.remove());
        }
    }

    public static void pop() {
        if (q.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(q.peek() + " is removed");
        q.remove();
    }

    public static int top() {
        System.out.print("Top is : ");
        return q.peek();
    }

    public static void main(String[] args) {
        pop();
        push(10);
        push(20);
        push(30);
        push(40);
        System.out.println(top());
        pop();
        pop();
        System.out.println(top());
    }
}
