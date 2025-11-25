package _13_Binary_Trees;

import java.util.Stack;

public class InOrderTraversalIterative {
    public static void inOrderTraversalIterative(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode current = root;

        while (true) {
            if (current != null) {
                st.push(current);
                current = current.left;
            } else {
                if (st.isEmpty()) {
                    break;
                }
                current = st.pop();
                System.out.print(current.val+" ");
                current = current.right;
            }
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        inOrderTraversalIterative(root);
    }
}
