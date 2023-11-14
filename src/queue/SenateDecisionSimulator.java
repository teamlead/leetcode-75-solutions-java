package queue;

import java.util.LinkedList;
import java.util.Queue;

public class SenateDecisionSimulator {

    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        int n = senate.length();

        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                radiant.offer(i);
            } else {
                dire.offer(i);
            }
        }

        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int rIndex = radiant.poll();
            int dIndex = dire.poll();
            if (rIndex < dIndex) {
                radiant.offer(rIndex + n);
            } else {
                dire.offer(dIndex + n);
            }
        }

        return radiant.isEmpty() ? "Dire" : "Radiant";
    }

    public static void main(String[] args) {
        SenateDecisionSimulator simulator = new SenateDecisionSimulator();

        assert simulator.predictPartyVictory("RD").equals("Radiant") : "Test case 1 failed";
        assert simulator.predictPartyVictory("RDD").equals("Dire") : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
