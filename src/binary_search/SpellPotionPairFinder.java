package binary_search;

import java.util.Arrays;

public class SpellPotionPairFinder {

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] pairs = new int[n];
        Arrays.sort(potions);
        for (int i = 0; i < n; i++) {
            int spell = spells[i];
            int left = 0;
            int right = m - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                long product = (long) spell * potions[mid];
                if (product >= success) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            pairs[i] = m - left;
        }
        return pairs;
    }

    public static void main(String[] args) {
        SpellPotionPairFinder finder = new SpellPotionPairFinder();

        int[] spells1 = {5, 1, 3}, potions1 = {1, 2, 3, 4, 5};
        long success1 = 7;
        assert Arrays.equals(finder.successfulPairs(spells1, potions1, success1), new int[]{4, 0, 3}) : "Test case 1 failed";

        int[] spells2 = {3, 1, 2}, potions2 = {8, 5, 8};
        long success2 = 16;
        assert Arrays.equals(finder.successfulPairs(spells2, potions2, success2), new int[]{2, 0, 2}) : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
