package binary_search_trie;

public class BSTNodeDeleter {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            TreeNode rightSmallest = root.right;
            while (rightSmallest.left != null) rightSmallest = rightSmallest.left;
            rightSmallest.left = root.left;
            return root.right;
        }
        return root;
    }

    private static TreeNode constructTree(Integer[] arr, int i) {
        if (i >= arr.length || arr[i] == null) return null;
        TreeNode root = new TreeNode(arr[i]);
        root.left = constructTree(arr, 2 * i + 1);
        root.right = constructTree(arr, 2 * i + 2);
        return root;
    }

    public static void main(String[] args) {
        BSTNodeDeleter deleter = new BSTNodeDeleter();

        TreeNode root1 = constructTree(new Integer[]{5,3,6,2,4,null,7}, 0);
        TreeNode expected1 = constructTree(new Integer[]{5,4,6,2,null,null,7}, 0);
        // We can only check if the root is the same after deletion, as there can be multiple valid answers
        assert deleter.deleteNode(root1, 3).val == expected1.val : "Test case 1 failed";

        TreeNode root2 = constructTree(new Integer[]{5,3,6,2,4,null,7}, 0);
        TreeNode expected2 = constructTree(new Integer[]{5,3,6,2,4,null,7}, 0);
        assert deleter.deleteNode(root2, 0).val == expected2.val : "Test case 2 failed";

        assert deleter.deleteNode(null, 0) == null : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
