package _09_Stack_Queue._Basics_Of_Stack_Queue;

import java.util.Stack;

public class MinStackOptimal {
    static Stack<Integer> st = new Stack<>();
    static int min;

    public static void push(int val) {
        if (st.isEmpty()) {
            min = val;
            st.push(val);
        } else {
            if (val > min) {
                st.push(val);
            } else {
                st.push(2 * val - min);
                min = val;
            }
        }
        System.out.println(val + " is pushed");
    }

    public static void pop() {
        if (st.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        int x = st.peek();
        st.pop();
        if (x < min) {
            min = 2 * min - x;
            System.out.println(min + " is popped");
        }
        System.out.println(x + " is popped");
    }

    public static void top() {
        if (st.isEmpty()) {
            System.out.println("NO values");
        }
        int x = st.peek();
        if (x < min) {
            System.out.println(min + " is top");
            return;
        }
        System.out.println(x + " is top");
    }

    public static int getMin() {
        return min;
    }

    public static void main(String[] args) {
        pop();
        push(5);
        push(2);
        push(8);
        System.out.println("Minimun is : " + getMin());
        pop();
        getMin();
        top();
    }
}
