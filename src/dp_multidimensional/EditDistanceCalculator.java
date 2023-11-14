package dp_multidimensional;

public class EditDistanceCalculator {

    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        int[][] cost = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            cost[i][0] = i;
        }
        for (int i = 1; i <= n; i++) {
            cost[0][i] = i;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    cost[i + 1][j + 1] = cost[i][j];
                } else {
                    int replace = cost[i][j];
                    int delete = cost[i][j + 1];
                    int insert = cost[i + 1][j];
                    cost[i + 1][j + 1] = Math.min(Math.min(replace, delete), insert) + 1;
                }
            }
        }
        return cost[m][n];
    }

    public static void main(String[] args) {
        EditDistanceCalculator calculator = new EditDistanceCalculator();

        assert calculator.minDistance("horse", "ros") == 3 : "Test case 1 failed";
        assert calculator.minDistance("intention", "execution") == 5 : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
