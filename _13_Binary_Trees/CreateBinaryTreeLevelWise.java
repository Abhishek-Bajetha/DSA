package _13_Binary_Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CreateBinaryTreeLevelWise {

    public static void main(String[] args) {
        TreeNode root = createBinaryTreeLevelWise();
        System.out.println(root.val);
    }

    public static TreeNode createBinaryTreeLevelWise() {
        Queue<TreeNode> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Add the root: ");
        int temp = sc.nextInt();

        TreeNode newNode = new TreeNode(temp);

        q.add(newNode);
        while (!q.isEmpty()) {

            TreeNode node = q.poll();

            System.out.println("Add left of " + node.val + ": ");
            temp = sc.nextInt();

            if (temp >= 0) {

                TreeNode leftNode = new TreeNode(temp);
                node.left = leftNode;
                q.add(leftNode);

            }

            System.out.println("Add right of " + node.val + ": ");
            temp = sc.nextInt();

            if (temp >= 0) {
                TreeNode rightNode = new TreeNode(temp);
                node.right = rightNode;
                q.add(rightNode);
            }

        }
        sc.close();
        return newNode;
    }
}

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}