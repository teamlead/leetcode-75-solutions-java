package hash_map_set;

import java.util.*;

public class UniqueOccurrenceChecker {

    public boolean hasUniqueOccurrences(int[] numbers) {
        Map<Integer, Integer> numberCounts = new HashMap<>();
        for (int num : numbers) {
            numberCounts.put(num, numberCounts.getOrDefault(num, 0) + 1);
        }

        Set<Integer> uniqueCounts = new HashSet<>(numberCounts.values());
        return numberCounts.size() == uniqueCounts.size();
    }

    public static void main(String[] args) {
        UniqueOccurrenceChecker checker = new UniqueOccurrenceChecker();

        assert checker.hasUniqueOccurrences(new int[]{1,2,2,1,1,3}) : "Test case 1 failed";
        assert !checker.hasUniqueOccurrences(new int[]{1,2}) : "Test case 2 failed";
        assert checker.hasUniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}) : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
