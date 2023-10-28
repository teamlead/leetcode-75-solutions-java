package array_string;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] kidsCandies, int additionalCandies) {

        List<Boolean> results = new ArrayList<>(kidsCandies.length);

        int highestCandies = 0;

        for (int candyCount : kidsCandies) {
            highestCandies = Math.max(candyCount, highestCandies);
        }

        int threshold = highestCandies - additionalCandies;

        for (int candyCount : kidsCandies) {
            results.add(candyCount >= threshold);
        }

        return results;
    }

    public static void main(String[] args) {

        GreatestNumberOfCandies solution = new GreatestNumberOfCandies();

        List<Boolean> result1 = solution.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);
        assert result1.equals(List.of(true, true, true, false, true)) : "Test case 1 failed";

        List<Boolean> result2 = solution.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1);
        assert result2.equals(List.of(true, false, false, false, false)) : "Test case 2 failed";

        List<Boolean> result3 = solution.kidsWithCandies(new int[]{12, 1, 12}, 10);
        assert result3.equals(List.of(true, false, true)) : "Test case 3 failed";

        System.out.println("All tests passed!");
    }
}
