package binary_search_trie;

public class BSTSearcher {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) return root;
        return val < root.val ? searchBST(root.left, val) : searchBST(root.right, val);
    }

    private static TreeNode constructTree(Integer[] arr, int i) {
        if (i >= arr.length || arr[i] == null) return null;
        TreeNode root = new TreeNode(arr[i]);
        root.left = constructTree(arr, 2 * i + 1);
        root.right = constructTree(arr, 2 * i + 2);
        return root;
    }

    private static boolean isEqual(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        return a.val == b.val && isEqual(a.left, b.left) && isEqual(a.right, b.right);
    }

    public static void main(String[] args) {
        BSTSearcher searcher = new BSTSearcher();

        TreeNode root1 = constructTree(new Integer[]{4,2,7,1,3}, 0);
        TreeNode expected1 = constructTree(new Integer[]{2,1,3}, 0);
        assert isEqual(searcher.searchBST(root1, 2), expected1) : "Test case 1 failed";

        TreeNode root2 = constructTree(new Integer[]{4,2,7,1,3}, 0);
        assert searcher.searchBST(root2, 5) == null : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
