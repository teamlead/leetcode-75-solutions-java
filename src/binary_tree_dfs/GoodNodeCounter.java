package binary_tree_dfs;

public class GoodNodeCounter {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private int count = 0;

    public int goodNodes(TreeNode root) {
        if (root == null) return 0;
        dfs(root, root.val);
        return count;
    }

    private void dfs(TreeNode node, int maxSoFar) {
        if (node == null) return;

        if (node.val >= maxSoFar) count++;

        dfs(node.left, Math.max(maxSoFar, node.val));
        dfs(node.right, Math.max(maxSoFar, node.val));
    }

    private static TreeNode constructTree(Integer[] arr, int i) {
        if (i >= arr.length || arr[i] == null) return null;
        TreeNode root = new TreeNode(arr[i]);
        root.left = constructTree(arr, 2 * i + 1);
        root.right = constructTree(arr, 2 * i + 2);
        return root;
    }

    public static void main(String[] args) {
        GoodNodeCounter counter = new GoodNodeCounter();

        TreeNode root1 = constructTree(new Integer[]{3,1,4,3,null,1,5}, 0);
        assert counter.goodNodes(root1) == 4 : "Test case 1 failed";

        TreeNode root2 = constructTree(new Integer[]{3,3,null,4,2}, 0);
        assert counter.goodNodes(root2) == 3 : "Test case 2 failed";

        TreeNode root3 = constructTree(new Integer[]{1}, 0);
        assert counter.goodNodes(root3) == 1 : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
