package array_string;

public class StringCompressor {

    public int compress(char[] chars) {
        int writeIdx = 0;  // index to write the compressed result
        int readIdx = 0;   // index to read from the original array
        while (readIdx < chars.length) {
            char current = chars[readIdx];
            int freq = 0;
            while (readIdx < chars.length && chars[readIdx] == current) {
                readIdx++;
                freq++;
            }
            chars[writeIdx++] = current;
            if (freq > 1) {
                for (char ch : Integer.toString(freq).toCharArray()) {
                    chars[writeIdx++] = ch;
                }
            }
        }
        return writeIdx;
    }

    public static void main(String[] args) {

        StringCompressor compressor = new StringCompressor();

        char[] testInput1 = {'a','a','b','b','c','c','c'};
        assert compressor.compress(testInput1) == 6 && new String(testInput1, 0, 6).equals("a2b2c3") : "Test case 1 failed";

        char[] testInput2 = {'a'};
        assert compressor.compress(testInput2) == 1 && new String(testInput2, 0, 1).equals("a") : "Test case 2 failed";

        char[] testInput3 = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        assert compressor.compress(testInput3) == 4 && new String(testInput3, 0, 4).equals("ab12") : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
