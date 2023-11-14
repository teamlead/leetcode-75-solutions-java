package binary_tree_bfs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.IntStream;

public class MaxLevelSumCalculator {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxLevelSum(TreeNode root) {
        int max = Integer.MIN_VALUE, maxLevel = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        for (int level = 1; !q.isEmpty(); ++level) {
            int sum = 0;
            for (int sz = q.size(); sz > 0; --sz) {
                TreeNode n = q.poll();
                sum += n.val;
                if (n.left != null) {
                    q.offer(n.left);
                }
                if (n.right != null) {
                    q.offer(n.right);
                }
            }
            if (max < sum) {
                max = sum;
                maxLevel = level;
            }
        }
        return maxLevel;
    }

    private static TreeNode createTreeFromArray(Integer[] arr, int index) {
        if (index < arr.length) {
            Integer value = arr[index];
            if (value == null) {
                return null;
            }
            TreeNode t = new TreeNode(value);
            t.left = createTreeFromArray(arr, 2 * index + 1);
            t.right = createTreeFromArray(arr, 2 * index + 2);
            return t;
        }
        return null;
    }

    public static void main(String[] args) {
        MaxLevelSumCalculator calculator = new MaxLevelSumCalculator();

        TreeNode root1 = createTreeFromArray(new Integer[]{1, 7, 0, null, 5, null, 4}, 0);
        assert calculator.maxLevelSum(root1) == 2 : "Test case 1 failed";

        TreeNode root2 = createTreeFromArray(new Integer[]{989, null, 10250, 98693, -89388, null, null, null, -32127}, 0);
        assert calculator.maxLevelSum(root2) == 2 : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
