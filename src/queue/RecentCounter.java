package queue;

import java.util.*;

class RecentCounter {

    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.offer(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }


    public static void main(String[] args) {
        RecentCounter counter = new RecentCounter();

        // Test cases
        boolean passed = true;
        passed &= counter.ping(1) == 1;
        passed &= counter.ping(100) == 2;
        passed &= counter.ping(3001) == 3;
        passed &= counter.ping(3002) == 3;

        if (passed) {
            System.out.println("All test cases passed!");
        } else {
            System.out.println("Some test cases failed.");
        }
    }
}
