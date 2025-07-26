package _07_String.Basic;

import java.util.Stack;

public class RemoveOutermostParentheses {
    public static String removeOuterParentheses(String s) {
        int counter = 0;
        StringBuilder sb = new StringBuilder("");
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (counter >= 1)
                    sb.append("(");
                st.push('(');
                counter++;
            }
            if (s.charAt(i) == ')') {
                if (counter > 1) {
                    sb.append(")");
                    counter--;
                    st.pop();
                } else {
                    counter--;
                    st.pop();
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String newString = removeOuterParentheses("(()())(())(()(()))");
        System.out.println(newString);
    }
}
