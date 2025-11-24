package _13_Binary_Trees;

import java.util.Stack;

public class PreOrderTraversalIterative {

    public static void preOrderTraversalIterative(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();

        st.push(root);
        while (!st.isEmpty()) {
            root = st.pop();

            System.out.print(root.val + " ");
            if (root.right != null) {
                st.push(root.right);
            }
            if (root.left != null) {
                st.push(root.left);
            }
        }
    }

    public static void main(String[] args) {

        // example 2 tree maually created
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        preOrderTraversalIterative(root);
    }
}
