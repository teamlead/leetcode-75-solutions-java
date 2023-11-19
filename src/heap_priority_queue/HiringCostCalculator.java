package heap_priority_queue;

import java.util.PriorityQueue;

public class HiringCostCalculator {

    public long totalCost(int[] costs, int k, int candidates) {
        int i = 0;
        int j = costs.length - 1;
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        long ans = 0;
        while (k-- > 0) {
            while (pq1.size() < candidates && i <= j) {
                pq1.offer(costs[i++]);
            }
            while (pq2.size() < candidates && i <= j) {
                pq2.offer(costs[j--]);
            }

            int t1 = pq1.size() > 0 ? pq1.peek() : Integer.MAX_VALUE;
            int t2 = pq2.size() > 0 ? pq2.peek() : Integer.MAX_VALUE;

            if (t1 <= t2) {
                ans += t1;
                pq1.poll();
            } else {
                ans += t2;
                pq2.poll();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        HiringCostCalculator calculator = new HiringCostCalculator();

        int[] costs1 = {17,12,10,2,7,2,11,20,8};
        int k1 = 3, candidates1 = 4;
        assert calculator.totalCost(costs1, k1, candidates1) == 11 : "Test case 1 failed";

        int[] costs2 = {1,2,4,1};
        int k2 = 3, candidates2 = 3;
        assert calculator.totalCost(costs2, k2, candidates2) == 4 : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
