package leetcode;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class MaxPathSum {
    private int maxSum = 0;

    public int maxPathSum(TreeNode root) {
        calculateMaxPath(root);
        return maxSum;
    }

    private int calculateMaxPath(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // Recursively calculate the maximum path sum of the left and right subtrees
        int leftMax = Math.max(0, calculateMaxPath(node.left));
        int rightMax = Math.max(0, calculateMaxPath(node.right));

        // Calculate the maximum path sum including the current node
        int currentMax = node.val + leftMax + rightMax;

        // Update the global maximum path sum
        maxSum = Math.max(maxSum, currentMax);

        // Return the maximum sum of the path passing through the current node and one of its children
        return node.val + Math.max(leftMax, rightMax);
    }

    public static void main(String[] args) {
        MaxPathSum solution = new MaxPathSum();

        // Constructing the binary tree:
        //        1
        //       / \
        //      2   3
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(7);

        int result = solution.maxPathSum(root);
        System.out.println("Maximum Path Sum: " + result);  // Output: 6
    }
}

