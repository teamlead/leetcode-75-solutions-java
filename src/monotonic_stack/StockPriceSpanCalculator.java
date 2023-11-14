package monotonic_stack;

import java.util.Stack;

public class StockPriceSpanCalculator {

    private final Stack<int[]> stack;

    public StockPriceSpanCalculator() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        while (!stack.isEmpty() && price >= stack.peek()[0]) {
            span += stack.peek()[1];
            stack.pop();
        }
        stack.push(new int[]{price, span});
        return span;
    }

    public static void main(String[] args) {
        StockPriceSpanCalculator stockSpanner = new StockPriceSpanCalculator();

        boolean passed = true;
        passed &= stockSpanner.next(100) == 1;
        passed &= stockSpanner.next(80) == 1;
        passed &= stockSpanner.next(60) == 1;
        passed &= stockSpanner.next(70) == 2;
        passed &= stockSpanner.next(60) == 1;
        passed &= stockSpanner.next(75) == 4;
        passed &= stockSpanner.next(85) == 6;

        if (passed) {
            System.out.println("All test cases passed!");
        } else {
            System.out.println("Some test cases failed.");
        }
    }
}
