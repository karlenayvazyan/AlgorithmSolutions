package Algorithm.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreeMaxDepthTest {

    private final TreeMaxDepth treeMaxDepth = new TreeMaxDepth();

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(
                3, new TreeNode(9), new TreeNode(
                20, new TreeNode(15), new TreeNode(7)));
        int i = treeMaxDepth.maxDepth(root);
        assertEquals(3, i);
    }

    @Test
    public void test_2() {
        TreeNode root = new TreeNode(
                2, null, new TreeNode(
                3, null, new TreeNode(
                4, null, new TreeNode(
                5, null, new TreeNode(
                6)
        )
        )));
        int i = treeMaxDepth.maxDepth(root);
        assertEquals(5, i);
    }

    @Test
    public void test_3() {
        TreeNode root = new TreeNode(
                -8,
                new TreeNode(
                        -6,
                        new TreeNode(
                                6,
                                null,
                                new TreeNode(5)),
                        null),
                        new TreeNode(7));
        int i = treeMaxDepth.maxDepth(root);
        assertEquals(4, i);
    }
}