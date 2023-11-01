package sliding_window;

import java.util.Set;

public class MaxVowelSubstringCalculator {

    public int maxVowels(String str, int substringLength) {
        int maxVowelsCount = 0;
        var vowels = Set.of('a', 'e', 'i', 'o', 'u');
        for (int i = 0, currentVowelsCount = 0; i < str.length(); ++i) {
            if (vowels.contains(str.charAt(i))) {
                ++currentVowelsCount;
            }
            if (i >= substringLength && vowels.contains(str.charAt(i - substringLength))) {
                --currentVowelsCount;
            }
            maxVowelsCount = Math.max(currentVowelsCount, maxVowelsCount);
        }
        return maxVowelsCount;
    }

    public static void main(String[] args) {

        MaxVowelSubstringCalculator calculator = new MaxVowelSubstringCalculator();

        assert calculator.maxVowels("abciiidef", 3) == 3 : "Test case 1 failed";
        assert calculator.maxVowels("aeiou", 2) == 2 : "Test case 2 failed";
        assert calculator.maxVowels("leetcode", 3) == 2 : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
