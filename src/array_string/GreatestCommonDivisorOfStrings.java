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

        assert solution.gcdOfStrings("ABCABC", "ABC").equals("ABC") : "Test case 1 failed";
        assert solution.gcdOfStrings("ABABAB", "ABAB").equals("AB") : "Test case 2 failed";
        assert solution.gcdOfStrings("LEET", "CODE").equals("") : "Test case 3 failed";

        System.out.println("All tests passed!");
    }
}
