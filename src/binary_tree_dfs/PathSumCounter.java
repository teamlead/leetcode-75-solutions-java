package binary_tree_dfs;

public class PathSumCounter {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int pathSumFrom(TreeNode node, int sum) {
        if (node == null) return 0;
        return (node.val == sum ? 1 : 0)
                + pathSumFrom(node.left, sum - node.val) + pathSumFrom(node.right, sum - node.val);
    }

    private static TreeNode constructTree(Integer[] arr, int i) {
        if (i >= arr.length || arr[i] == null) return null;
        TreeNode root = new TreeNode(arr[i]);
        root.left = constructTree(arr, 2 * i + 1);
        root.right = constructTree(arr, 2 * i + 2);
        return root;
    }

    public static void main(String[] args) {
        PathSumCounter counter = new PathSumCounter();

        TreeNode root1 = constructTree(new Integer[]{10,5,-3,3,2,null,11,3,-2,null,1}, 0);
        assert counter.pathSum(root1, 8) == 3 : "Test case 1 failed";

        TreeNode root2 = constructTree(new Integer[]{5,4,8,11,null,13,4,7,2,null,null,5,1}, 0);
        assert counter.pathSum(root2, 22) == 3 : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
