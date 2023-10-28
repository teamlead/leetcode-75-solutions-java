package array_string;

public class ReverseVowelsOfString {

    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public String reverseVowelsInString(String s) {
        if (s == null || s.isEmpty()) return s;

        char[] chars = s.toCharArray();
        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < right && !isVowel(chars[left])) {
                left++;
            }

            while (left < right && !isVowel(chars[right])) {
                right--;
            }

            if (left < right) {
                char tempChar = chars[left];
                chars[left] = chars[right];
                chars[right] = tempChar;
                left++;
                right--;
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {

        ReverseVowelsOfString reverser = new ReverseVowelsOfString();

        assert reverser.reverseVowelsInString("hello").equals("holle") : "Test case 1 failed";
        assert reverser.reverseVowelsInString("leetcode").equals("leotcede") : "Test case 2 failed";

        System.out.println("All tests passed!");
    }


}
