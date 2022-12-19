package Dz4;

import java.util.Stack;


public class Task3 {
    public boolean isSymmetric(TreeNode root) {

        if (root == null) return true;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);

        while (!stack.isEmpty()) {
            TreeNode leftNode = stack.pop();
            TreeNode rightNode = stack.pop();

            if (leftNode == null && rightNode == null) continue;
            if (leftNode == null || rightNode == null) return false;
            if (leftNode.val != rightNode.val) return false;

            stack.push(leftNode.left);
            stack.push(rightNode.right);
            stack.push(leftNode.right);
            stack.push(rightNode.left);

        }

        return true;
    }
}



