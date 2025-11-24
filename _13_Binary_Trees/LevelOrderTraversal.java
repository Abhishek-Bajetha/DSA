package _13_Binary_Trees;

import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

public class LevelOrderTraversal {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for(int i = 0; i < size; i++){

                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);

                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = null;
        root.left.right = null;
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = levelOrder(root);
        for (List<Integer> list : result) {
            for (Integer list2 : list) {
                System.out.print(list2 + " ");
            }
            System.out.println();
        }
    }
}