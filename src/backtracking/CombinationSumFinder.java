package backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumFinder {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        combination(ans, new ArrayList<>(), k, 1, n);
        return ans;
    }

    private void combination(List<List<Integer>> ans, List<Integer> comb, int k, int start, int n) {
        if (comb.size() == k && n == 0) {
            List<Integer> li = new ArrayList<>(comb);
            ans.add(li);
            return;
        }
        for (int i = start; i <= 9; i++) {
            comb.add(i);
            combination(ans, comb, k, i + 1, n - i);
            comb.remove(comb.size() - 1);
        }
    }

    public static void main(String[] args) {
        CombinationSumFinder finder = new CombinationSumFinder();

        List<List<Integer>> result1 = finder.combinationSum3(3, 7);
        List<List<Integer>> expected1 = List.of(List.of(1, 2, 4));
        assert result1.equals(expected1) : "Test case 1 failed";

        List<List<Integer>> result2 = finder.combinationSum3(3, 9);
        List<List<Integer>> expected2 = List.of(List.of(1, 2, 6), List.of(1, 3, 5), List.of(2, 3, 4));
        assert result2.equals(expected2) : "Test case 2 failed";

        List<List<Integer>> result3 = finder.combinationSum3(4, 1);
        List<List<Integer>> expected3 = List.of();
        assert result3.equals(expected3) : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
