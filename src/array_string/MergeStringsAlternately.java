package array_string;

class MergeStringsAlternately {

    public String mergeAlternately(String firstString, String secondString) {
        StringBuffer combined = new StringBuffer();
        int index = 0;

        while (index < firstString.length() || index < secondString.length()) {
            if (index < firstString.length()) {
                combined.append(firstString.charAt(index));
            }
            if (index < secondString.length()) {
                combined.append(secondString.charAt(index));
            }
            index++;
        }

        return combined.toString();
    }

    public static void main(String[] args) {

        MergeStringsAlternately solution = new MergeStringsAlternately();

        String result1 = solution.mergeAlternately("abc", "pqr");
        assert "apbqcr".equals(result1) : "Test case 1 failed";

        String result2 = solution.mergeAlternately("ab", "pqrs");
        assert "apbqrs".equals(result2) : "Test case 2 failed";

        String result3 = solution.mergeAlternately("abcd", "pq");
        assert "apbqcd".equals(result3) : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
