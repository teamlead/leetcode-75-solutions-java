package array_string;

public class ReverseWordsInString {

    public String reverseWords(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        String[] words = input.trim().split("\\s+");
        StringBuilder reversedString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i != 0) {
                reversedString.append(" ");
            }
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        ReverseWordsInString reverser = new ReverseWordsInString();

        // Sample assertions
        assert reverser.reverseWords("the sky is blue").equals("blue is sky the") : "Test case 1 failed";
        assert reverser.reverseWords("  hello world  ").equals("world hello") : "Test case 2 failed";
        assert reverser.reverseWords("a good   example").equals("example good a") : "Test case 3 failed";

        System.out.println("All tests passed!");
    }
}
