package _09_Stack_Queue._Basics_Of_Stack_Queue;

import java.util.Stack;

class Pair {
    int value;
    int currentMin;

    Pair(int value, int currentMin) {
        this.value = value;
        this.currentMin = currentMin;
    }
}

public class MinStackBruteforce {
    static Stack<Pair> st = new Stack<>();

    public static void push(int val) {
        if (st.isEmpty()) {
            st.push(new Pair(val, val));
        } else {
            st.push(new Pair(val, Math.min(val, st.peek().currentMin)));
        }
        System.out.println(val + " is pushed");
    }
    
    public static void pop() {
        if (st.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(st.pop().value + " is popped");
    }
    
    public static void top() {
        System.out.println("Top is : " + st.peek().value);
        
    }

    public static int getMin() {
        return st.peek().currentMin;
    }

    public static void main(String[] args) {
        pop();
        push(5);
        push(2);
        push(8);
        System.out.println("Minimun is : "+ getMin());
        pop();
        getMin();
        top();
    }
}
