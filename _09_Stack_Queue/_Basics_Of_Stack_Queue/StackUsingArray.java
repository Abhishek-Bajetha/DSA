package _09_Stack_Queue._Basics_Of_Stack_Queue;

public class StackUsingArray {
    static int top = -1;
    static int stack[] = new int[10];

    public static void push(int val) {
        if (top >= stack.length) {
            System.out.println("Stack is full...");
            return;
        }
        top++;
        stack[top] = val;
        System.out.println(val + " is pushed...");
        return;
    }

    public static void top() {
        if (top == -1) {
            System.out.println("Underflow");
            return;
        }
        System.out.println(stack[top]);
        return;
    }

    public static void pop() {
        if (top == -1)
            return;
        System.out.println(stack[top] + " is popped...");
        top--;
        return;
    }

    public static void size() {
        System.out.println("Size is : " + (top + 1));
    }

    public static void main(String[] args) {
        size();
        push(10);
        push(20);
        push(30);
        size();
        top();
        pop();
        top();
        size();
    }
}
