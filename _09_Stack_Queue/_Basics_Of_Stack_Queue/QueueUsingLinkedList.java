package _09_Stack_Queue._Basics_Of_Stack_Queue;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueUsingLinkedList {
    static Node start, end;
    static int size = 0;

    public static void push(int x) {
        Node temp = new Node(x);
        if (start == null) {
            start = temp;
            end = temp;
        } else {
            end.next = temp;
            end = end.next;
        }
        size += 1;
    }

    public static void pop() {
        Node temp = start;
        if (start == null) {
            System.out.println("No elements");
            return;
        }
        start = start.next;
        temp.next = null;
        size -= 1;
    }

    public static int top() {
        if (start == null) {
            System.out.print("No elements ");
            return -1;
        }

        return start.data;
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        System.out.println(top());
        pop();
        System.out.println(top());
        pop();
        System.out.println(top());
        pop();
        System.out.println(top());
        pop();
        System.out.println(top());
    }
}
