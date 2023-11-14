package graphs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class MazeExitFinder {

    public int nearestExit(char[][] maze, int[] entrance) {
        int rows = maze.length, cols = maze[0].length, queueSize;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[rows][cols];
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int x, y, steps = 0;

        queue.offer(entrance);
        visited[entrance[0]][entrance[1]] = true;

        while (!queue.isEmpty()) {
            queueSize = queue.size();
            steps++;

            for (int i = 0; i < queueSize; i++) {
                int[] curr = queue.poll();

                for (int[] dir : dirs) {
                    x = dir[0] + curr[0];
                    y = dir[1] + curr[1];

                    if (x < 0 || x >= rows || y < 0 || y >= cols) continue;
                    if (visited[x][y] || maze[x][y] == '+') continue;

                    if (x == 0 || x == rows - 1 || y == 0 || y == cols - 1) return steps;

                    queue.offer(new int[]{x, y});
                    visited[x][y] = true;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        MazeExitFinder finder = new MazeExitFinder();

        char[][] maze1 = {{'+','+','.','+'},{'.','.','.','+'},{'+','+','+','.'}};
        int[] entrance1 = {1, 2};
        assert finder.nearestExit(maze1, entrance1) == 1 : "Test case 1 failed";

        char[][] maze2 = {{'+','+','+'},{'.','.','.'},{'+','+','+'}};
        int[] entrance2 = {1, 0};
        assert finder.nearestExit(maze2, entrance2) == 2 : "Test case 2 failed";

        char[][] maze3 = {{'.','+'}};
        int[] entrance3 = {0, 0};
        assert finder.nearestExit(maze3, entrance3) == -1 : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
