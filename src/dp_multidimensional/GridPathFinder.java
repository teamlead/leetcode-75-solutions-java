package dp_multidimensional;

public class GridPathFinder {

    public int uniquePaths(int m, int n) {
        Integer[][] map = new Integer[m][n];
        for (int i = 0; i < m; i++) {
            map[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            map[0][j] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                map[i][j] = map[i - 1][j] + map[i][j - 1];
            }
        }
        return map[m - 1][n - 1];
    }

    public static void main(String[] args) {
        GridPathFinder finder = new GridPathFinder();

        assert finder.uniquePaths(3, 7) == 28 : "Test case 1 failed";
        assert finder.uniquePaths(3, 2) == 3 : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
