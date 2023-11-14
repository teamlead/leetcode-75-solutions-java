package stack;

import java.util.Stack;
import java.util.Arrays;

public class AsteroidCollisionSimulator {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            collision:
            {
                while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                    if (stack.peek() < -asteroid) {
                        stack.pop();
                        continue;
                    } else if (stack.peek() == -asteroid) {
                        stack.pop();
                    }
                    break collision;
                }
                stack.push(asteroid);
            }
        }
        return stack.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        AsteroidCollisionSimulator simulator = new AsteroidCollisionSimulator();

        assert Arrays.equals(simulator.asteroidCollision(new int[] {5, 10, -5}), new int[] {5, 10})  : "Test case 1 failed";
        assert Arrays.equals(simulator.asteroidCollision(new int[] {8, -8}), new int[] {})  : "Test case 2 failed";
        assert Arrays.equals(simulator.asteroidCollision(new int[] {10, 2, -5}), new int[] {10})  : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
