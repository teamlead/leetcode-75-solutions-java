package stack;
import java.util.*;

public class StarStringProcessor {

    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        StarStringProcessor processor = new StarStringProcessor();

        assert processor.removeStars("leet**cod*e").equals("lecoe") : "Test case 1 failed";
        assert processor.removeStars("erase*****").equals("") : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
