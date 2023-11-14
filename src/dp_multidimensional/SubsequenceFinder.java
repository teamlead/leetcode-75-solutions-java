package dp_multidimensional;

public class SubsequenceFinder {

    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for (int i = 0; i < text1.length(); ++i) {
            for (int j = 0; j < text2.length(); ++j) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i + 1][j + 1] = 1 + dp[i][j];
                } else {
                    dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }

    public static void main(String[] args) {
        SubsequenceFinder finder = new SubsequenceFinder();

        assert finder.longestCommonSubsequence("abcde", "ace") == 3 : "Test case 1 failed";
        assert finder.longestCommonSubsequence("abc", "abc") == 3 : "Test case 2 failed";
        assert finder.longestCommonSubsequence("abc", "def") == 0 : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
