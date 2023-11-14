package heap_priority_queue;

import java.util.PriorityQueue;

public class SmallestInfiniteSet {

    private final PriorityQueue<Integer> pq;
    private int i;

    public SmallestInfiniteSet() {
        pq = new PriorityQueue<>();
        i = 1;
    }

    public int popSmallest() {
        if (pq.isEmpty()) {
            return i++;
        }
        return pq.poll();
    }

    public void addBack(int num) {
        if (num < i && !pq.contains(num)) {
            pq.add(num);
        }
    }

    public static void main(String[] args) {
        SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();

        smallestInfiniteSet.addBack(2);
        assert smallestInfiniteSet.popSmallest() == 1 : "Test case 1.1 failed";
        assert smallestInfiniteSet.popSmallest() == 2 : "Test case 1.2 failed";
        assert smallestInfiniteSet.popSmallest() == 3 : "Test case 1.3 failed";

        smallestInfiniteSet.addBack(1);
        assert smallestInfiniteSet.popSmallest() == 1 : "Test case 2.1 failed";
        assert smallestInfiniteSet.popSmallest() == 4 : "Test case 2.2 failed";
        assert smallestInfiniteSet.popSmallest() == 5 : "Test case 2.3 failed";

        System.out.println("All test cases passed!");
    }
}
