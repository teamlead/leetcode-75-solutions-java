package binary_tree_dfs;

public class ZigZagPathCalculator {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private int maxStep = 0;

    public int longestZigZag(TreeNode root) {
        dfs(root, true, 0);
        dfs(root, false, 0);
        return maxStep;
    }

    private void dfs(TreeNode node, boolean isLeft, int step) {
        if (node == null) return;
        maxStep = Math.max(maxStep, step);
        if (isLeft) {
            dfs(node.left, false, step + 1);
            dfs(node.right, true, 1);
        } else {
            dfs(node.right, true, step + 1);
            dfs(node.left, false, 1);
        }
    }

    private static TreeNode constructTree(Integer[] arr, int i) {
        if (i >= arr.length || arr[i] == null) return null;
        TreeNode root = new TreeNode(arr[i]);
        root.left = constructTree(arr, 2 * i + 1);
        root.right = constructTree(arr, 2 * i + 2);
        return root;
    }

    public static void main(String[] args) {
        ZigZagPathCalculator calculator = new ZigZagPathCalculator();

        TreeNode root1 = constructTree(new Integer[]{1,null,1,1,1,null,null,1,1,null,1,null,null,null,1}, 0);
        assert calculator.longestZigZag(root1) == 3 : "Test case 1 failed";

        TreeNode root2 = constructTree(new Integer[]{1,1,1,null,1,null,null,1,1,null,1}, 0);
        assert calculator.longestZigZag(root2) == 4 : "Test case 2 failed";

        TreeNode root3 = constructTree(new Integer[]{1}, 0);
        assert calculator.longestZigZag(root3) == 0 : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
