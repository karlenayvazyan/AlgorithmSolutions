package Algorithm.tree;

public class TreeMaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        TreeNode leftCurrent = root.left;
        int leftDepth = 1;
        while (leftCurrent != null) {
            leftDepth++;
            leftCurrent = leftCurrent.left;
        }
        TreeNode rightCurrent = root.right;
        int rightDepth = 1;
        while (rightCurrent != null) {
            rightDepth++;
            rightCurrent = rightCurrent.right;
        }
        return Math.max(rightDepth, leftDepth);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}