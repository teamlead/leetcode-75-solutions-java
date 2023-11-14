package graphs_dfs;

import java.util.HashSet;
import java.util.List;
import java.util.Stack;
import java.util.Arrays;

public class RoomAccessChecker {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> dfs = new Stack<>();
        dfs.add(0);
        HashSet<Integer> seen = new HashSet<>();
        seen.add(0);
        while (!dfs.isEmpty()) {
            int i = dfs.pop();
            for (int j : rooms.get(i)) {
                if (!seen.contains(j)) {
                    dfs.add(j);
                    seen.add(j);
                    if (rooms.size() == seen.size()) return true;
                }
            }
        }
        return rooms.size() == seen.size();
    }

    public static void main(String[] args) {
        RoomAccessChecker checker = new RoomAccessChecker();

        List<List<Integer>> rooms1 = Arrays.asList(Arrays.asList(1), Arrays.asList(2), Arrays.asList(3), Arrays.asList());
        assert checker.canVisitAllRooms(rooms1) : "Test case 1 failed";

        List<List<Integer>> rooms2 = Arrays.asList(Arrays.asList(1, 3), Arrays.asList(3, 0, 1), Arrays.asList(2), Arrays.asList(0));
        assert !checker.canVisitAllRooms(rooms2) : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
