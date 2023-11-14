package graphs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOrangesCalculator {

    public int orangesRotting(int[][] grid) {
        Queue<int[]> qu = new LinkedList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    qu.offer(new int[]{i, j});
                }
            }
        }

        int[][] direction = {{1, 0}, {0, 1}, {0, -1}, {-1, 0}};
        int level = 0;

        while (!qu.isEmpty()) {
            level++;
            int size = qu.size();
            for (int i = 0; i < size; i++) {
                int[] rotten = qu.poll();
                for (int[] dir : direction) {
                    int nx = dir[0] + rotten[0];
                    int ny = dir[1] + rotten[1];

                    if (nx < 0 || ny < 0 || nx >= grid.length || ny >= grid[0].length || grid[nx][ny] != 1)
                        continue;

                    grid[nx][ny] = 2;
                    qu.offer(new int[]{nx, ny});
                }
            }
        }

        for (int[] x : grid) {
            for (int y : x) {
                if (y == 1)
                    return -1;
            }
        }

        return level == 0 ? 0 : level - 1;
    }

    public static void main(String[] args) {
        RottenOrangesCalculator calculator = new RottenOrangesCalculator();

        int[][] grid1 = {{2,1,1},{1,1,0},{0,1,1}};
        assert calculator.orangesRotting(grid1) == 4 : "Test case 1 failed";

        int[][] grid2 = {{2,1,1},{0,1,1},{1,0,1}};
        assert calculator.orangesRotting(grid2) == -1 : "Test case 2 failed";

        int[][] grid3 = {{0,2}};
        assert calculator.orangesRotting(grid3) == 0 : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
