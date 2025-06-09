package _09_Stack_Queue._Basics_Of_Stack_Queue;

public class QueueUsingArray {

    static int queue[] = new int[2];
    static int start = -1, end = -1, currentSize = 0;

    public static void enqueue(int data) {
        if (currentSize == queue.length) {
            System.out.println("Queue is full");
            return;
        }
        if (currentSize == 0) {
            start = 0;
            end = 0;
        } else {
            end = (end + 1) % queue.length;
        }
        queue[end] = data;
        currentSize++;
        System.out.println(queue[end] + " is added");
    }

    public static void dequeue() {
        if (currentSize == 0) {
            System.out.println("Queue is empty");
            return;
        }
        int data = queue[start];
        if (currentSize == 1) {
            start = -1;
            end = -1;
        } else {
            start = (start + 1) % queue.length;
        }
        currentSize--;
        System.out.println(data + " is removed");
    }

    public static void top() {
        if (currentSize == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Top is: " + queue[start]);
    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        dequeue();
        top();
        dequeue();
        dequeue();
        enqueue(40);
    }
}
