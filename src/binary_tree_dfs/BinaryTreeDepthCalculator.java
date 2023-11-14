package binary_tree_dfs;

public class BinaryTreeDepthCalculator {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

    private static TreeNode constructTree(Integer[] arr, int i) {
        if (i >= arr.length || arr[i] == null) return null;
        TreeNode root = new TreeNode(arr[i]);
        root.left = constructTree(arr, 2 * i + 1);
        root.right = constructTree(arr, 2 * i + 2);
        return root;
    }

    public static void main(String[] args) {
        BinaryTreeDepthCalculator calculator = new BinaryTreeDepthCalculator();

        TreeNode root1 = constructTree(new Integer[]{3, 9, 20, null, null, 15, 7}, 0);
        assert calculator.maxDepth(root1) == 3 : "Test case 1 failed";

        TreeNode root2 = constructTree(new Integer[]{1, null, 2}, 0);
        assert calculator.maxDepth(root2) == 2 : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
