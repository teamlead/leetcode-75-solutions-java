package stack;

import java.util.Stack;

public class StringDecoder {

    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int num = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + c - '0';
            } else if (c == '[') {
                strStack.push(currentString);
                currentString = new StringBuilder();
                numStack.push(num);
                num = 0;
            } else if (c == ']') {
                StringBuilder temp = currentString;
                currentString = strStack.pop();
                int count = numStack.pop();
                for (int i = 0; i < count; i++) {
                    currentString.append(temp);
                }
            } else {
                currentString.append(c);
            }
        }
        return currentString.toString();
    }

    public static void main(String[] args) {
        StringDecoder decoder = new StringDecoder();

        assert decoder.decodeString("3[a]2[bc]").equals("aaabcbc") : "Test case 1 failed";
        assert decoder.decodeString("3[a2[c]]").equals("accaccacc") : "Test case 2 failed";
        assert decoder.decodeString("2[abc]3[cd]ef").equals("abcabccdcdcdef") : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
