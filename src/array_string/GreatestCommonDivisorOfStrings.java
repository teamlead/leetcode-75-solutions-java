package array_string;

public class GreatestCommonDivisorOfStrings {

    public String gcdOfStrings(String firstString, String secondString) {
        if (!isConcatenationEqual(firstString, secondString)) {
            return "";
        }

        int commonGCD = computeGCD(firstString.length(), secondString.length());
        return firstString.substring(0, commonGCD);
    }

    private boolean isConcatenationEqual(String first, String second) {
        return (first + second).equals(second + first);
    }

    private int computeGCD(int num1, int num2) {
        return (num2 == 0) ? num1 : computeGCD(num2, num1 % num2);
    }

    public static void main(String[] args) {
        GreatestCommonDivisorOfStrings solution = new GreatestCommonDivisorOfStrings();

        // Sample asserts
        assert solution.gcdOfStrings("ABCABC", "ABC").equals("ABC");
        assert solution.gcdOfStrings("ABABAB", "ABAB").equals("AB");
        assert solution.gcdOfStrings("LEET", "CODE").equals("");

        System.out.println("All tests passed!");
    }
}
