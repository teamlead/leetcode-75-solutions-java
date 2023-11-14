package binary_tree_dfs;

public class LowestCommonAncestorFinder {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        return left == null ? right : right == null ? left : root;
    }

    private static TreeNode constructTree(Integer[] arr, int i) {
        if (i >= arr.length || arr[i] == null) return null;
        TreeNode root = new TreeNode(arr[i]);
        root.left = constructTree(arr, 2 * i + 1);
        root.right = constructTree(arr, 2 * i + 2);
        return root;
    }

    private static TreeNode findNode(TreeNode root, int val) {
        if (root == null || root.val == val) return root;
        TreeNode left = findNode(root.left, val);
        TreeNode right = findNode(root.right, val);
        return left != null ? left : right;
    }

    public static void main(String[] args) {
        LowestCommonAncestorFinder finder = new LowestCommonAncestorFinder();

        TreeNode root1 = constructTree(new Integer[]{3,5,1,6,2,0,8,null,null,7,4}, 0);
        assert finder.lowestCommonAncestor(root1, findNode(root1, 5), findNode(root1, 1)).val == 3 : "Test case 1 failed";

        TreeNode root2 = constructTree(new Integer[]{3,5,1,6,2,0,8,null,null,7,4}, 0);
        assert finder.lowestCommonAncestor(root2, findNode(root2, 5), findNode(root2, 4)).val == 5 : "Test case 2 failed";

        TreeNode root3 = constructTree(new Integer[]{1,2}, 0);
        assert finder.lowestCommonAncestor(root3, findNode(root3, 1), findNode(root3, 2)).val == 1 : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
