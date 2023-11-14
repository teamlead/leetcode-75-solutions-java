package graphs_dfs;

public class FriendshipCircleFinder {

    public int findCircleNum(int[][] M) {
        boolean[] visited = new boolean[M.length];
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            if (!visited[i]) {
                dfs(M, visited, i);
                count++;
            }
        }
        return count;
    }

    private void dfs(int[][] M, boolean[] visited, int person) {
        for (int other = 0; other < M.length; other++) {
            if (M[person][other] == 1 && !visited[other]) {
                visited[other] = true;
                dfs(M, visited, other);
            }
        }
    }

    public static void main(String[] args) {
        FriendshipCircleFinder finder = new FriendshipCircleFinder();

        int[][] isConnected1 = {{1,1,0},{1,1,0},{0,0,1}};
        assert finder.findCircleNum(isConnected1) == 2 : "Test case 1 failed";

        int[][] isConnected2 = {{1,0,0},{0,1,0},{0,0,1}};
        assert finder.findCircleNum(isConnected2) == 3 : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
