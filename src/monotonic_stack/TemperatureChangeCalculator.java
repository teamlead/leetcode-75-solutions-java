package monotonic_stack;

import java.util.*;

public class TemperatureChangeCalculator {

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] daysToWarmerTemperature = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                daysToWarmerTemperature[idx] = i - idx;
            }
            stack.push(i);
        }
        return daysToWarmerTemperature;
    }

    public static void main(String[] args) {
        TemperatureChangeCalculator calculator = new TemperatureChangeCalculator();

        assert java.util.Arrays.equals(calculator.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73}), new int[]{1,1,4,2,1,1,0,0}) : "Test case 1 failed";
        assert java.util.Arrays.equals(calculator.dailyTemperatures(new int[]{30,40,50,60}), new int[]{1,1,1,0}) : "Test case 2 failed";
        assert java.util.Arrays.equals(calculator.dailyTemperatures(new int[]{30,60,90}), new int[]{1,1,0}) : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
