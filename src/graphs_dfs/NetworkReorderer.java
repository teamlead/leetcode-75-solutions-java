package graphs_dfs;

import java.util.ArrayList;
import java.util.List;

public class NetworkReorderer {

    private int dfs(List<List<Integer>> al, boolean[] visited, int from) {
        int change = 0;
        visited[from] = true;
        for (int to : al.get(from))
            if (!visited[Math.abs(to)])
                change += dfs(al, visited, Math.abs(to)) + (to > 0 ? 1 : 0);
        return change;
    }

    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> al = new ArrayList<>();
        for (int i = 0; i < n; ++i)
            al.add(new ArrayList<>());
        for (int[] c : connections) {
            al.get(c[0]).add(c[1]);
            al.get(c[1]).add(-c[0]);
        }
        return dfs(al, new boolean[n], 0);
    }

    public static void main(String[] args) {
        NetworkReorderer reorderer = new NetworkReorderer();

        int[][] connections1 = {{0,1},{1,3},{2,3},{4,0},{4,5}};
        assert reorderer.minReorder(6, connections1) == 3 : "Test case 1 failed";

        int[][] connections2 = {{1,0},{1,2},{3,2},{3,4}};
        assert reorderer.minReorder(5, connections2) == 2 : "Test case 2 failed";

        int[][] connections3 = {{1,0},{2,0}};
        assert reorderer.minReorder(3, connections3) == 0 : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
