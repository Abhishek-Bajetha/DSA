package _09_Stack_Queue._Basics_Of_Stack_Queue;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackUsingLinkedList {
    static Node top = null;
    static int size = 0;

    public static void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println(data + " is pushed");
    }

    public static void pop() {
        if (size == 0) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(top.data + " is poped");
        Node temp = top;
        top = top.next;
        temp.next = null;
        size--;
    }

    public static void top() {
        System.out.println(top.data);
    }

    public static void size() {
        System.out.println(size);
    }

    public static void main(String[] args) {
        push(10);
        top();
        pop();
        pop();
        push(20);
        size();
    }
}
