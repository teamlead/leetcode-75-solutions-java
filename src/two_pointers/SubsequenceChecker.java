package two_pointers;

public class SubsequenceChecker {

    public boolean isSubsequence(String sub, String mainStr) {
        if (sub.isEmpty()) return true;
        int subIndex = 0, mainIndex = 0;

        while (mainIndex < mainStr.length()) {
            if (mainStr.charAt(mainIndex) == sub.charAt(subIndex)) {
                subIndex++;
                if (subIndex == sub.length()) return true;
            }
            mainIndex++;
        }
        return false;
    }

    public static void main(String[] args) {

        SubsequenceChecker checker = new SubsequenceChecker();

        assert checker.isSubsequence("abc", "ahbgdc") : "Test case 1 failed";
        assert !checker.isSubsequence("axc", "ahbgdc") : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
