package _09_Stack_Queue._Basics_Of_Stack_Queue;

import java.util.Stack;

public class BalancedParantesis {
    public static boolean balancedParantesis(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                if ((s.charAt(i) == ')' && st.peek() == '(') || (s.charAt(i) == '}' && st.peek() == '{')
                        || (s.charAt(i) == ']' && st.peek() == '[')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{[)]}";
        System.out.println(balancedParantesis(s));
    }
}
