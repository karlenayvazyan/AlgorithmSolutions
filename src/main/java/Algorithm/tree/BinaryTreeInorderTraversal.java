package Algorithm.tree;

import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode head;
        while (root != null) {
            System.out.println(root.val);
            root = root.left;
        }
        return null;
    }

    public static void main(String[] args) {
        // [1,null,2,3]
        new BinaryTreeInorderTraversal()
                .inorderTraversal(
                        new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null))
                );
    }
}
