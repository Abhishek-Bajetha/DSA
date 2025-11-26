package _13_Binary_Trees;

import java.util.Stack;

public class PostOrderTraversalIterative2Stack {
    public static void postOrderTraversalIterative2Stack(TreeNode root) {
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        st1.push(root);
        while (!st1.isEmpty()) {
            root = st1.pop();
            st2.push(root);
            if (root.left != null) {
                st1.push(root.left);
            }
            if (root.right != null) {
                st1.push(root.right);
            }
        }
        while (!st2.isEmpty()) {
            System.out.print(st2.pop().val + " ");
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        postOrderTraversalIterative2Stack(root);
    }
}
