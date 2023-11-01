package hash_map_set;

import java.util.Arrays;

public class StringCloseChecker {

    private static final int LETTER_COUNT = 26;

    public boolean areStringsClose(String str1, String str2) {
        int[] freq1 = new int[LETTER_COUNT];
        int[] freq2 = new int[LETTER_COUNT];

        for (char ch : str1.toCharArray()) {
            freq1[ch - 'a']++;
        }

        for (char ch : str2.toCharArray()) {
            freq2[ch - 'a']++;
        }

        for (int i = 0; i < LETTER_COUNT; i++) {
            if (freq1[i] == 0 && freq2[i] != 0 || freq1[i] != 0 && freq2[i] == 0) {
                return false;
            }
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);
    }

    public static void main(String[] args) {
        StringCloseChecker checker = new StringCloseChecker();

        assert checker.areStringsClose("abc", "bca") : "Test case 1 failed";
        assert !checker.areStringsClose("a", "aa") : "Test case 2 failed";
        assert checker.areStringsClose("cabbba", "abbccc") : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
