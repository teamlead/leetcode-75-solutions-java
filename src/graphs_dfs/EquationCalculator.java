package graphs_dfs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EquationCalculator {

    public double[] calcEquation(String[][] eq, double[] vals, String[][] q) {
        Map<String, Map<String, Double>> m = new HashMap<>();
        for (int i = 0; i < vals.length; i++) {
            m.putIfAbsent(eq[i][0], new HashMap<>());
            m.putIfAbsent(eq[i][1], new HashMap<>());
            m.get(eq[i][0]).put(eq[i][1], vals[i]);
            m.get(eq[i][1]).put(eq[i][0], 1 / vals[i]);
        }
        double[] r = new double[q.length];
        for (int i = 0; i < q.length; i++) {
            r[i] = dfs(q[i][0], q[i][1], 1, m, new HashSet<>());
        }
        return r;
    }

    private double dfs(String s, String t, double r, Map<String, Map<String, Double>> m, Set<String> seen) {
        if (!m.containsKey(s) || !seen.add(s)) return -1;
        if (s.equals(t)) return r;
        Map<String, Double> next = m.get(s);
        for (String c : next.keySet()) {
            double result = dfs(c, t, r * next.get(c), m, seen);
            if (result != -1) return result;
        }
        return -1;
    }

    public static void main(String[] args) {
        EquationCalculator solver = new EquationCalculator();

        String[][] equations1 = {{"a","b"},{"b","c"}};
        double[] values1 = {2.0, 3.0};
        String[][] queries1 = {{"a","c"},{"b","a"},{"a","e"},{"a","a"},{"x","x"}};
        double[] expected1 = {6.0, 0.5, -1.0, 1.0, -1.0};
        assert java.util.Arrays.equals(solver.calcEquation(equations1, values1, queries1), expected1) : "Test case 1 failed";

        String[][] equations2 = {{"a","b"},{"b","c"},{"bc","cd"}};
        double[] values2 = {1.5, 2.5, 5.0};
        String[][] queries2 = {{"a","c"},{"c","b"},{"bc","cd"},{"cd","bc"}};
        double[] expected2 = {3.75000, 0.40000, 5.00000, 0.20000};
        assert java.util.Arrays.equals(solver.calcEquation(equations2, values2, queries2), expected2) : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
