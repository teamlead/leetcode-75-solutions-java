# LeetCode 75 Solutions in Java

This repository contains solutions to [LeetCode's 75 Essential & Trending Problems](https://leetcode.com/studyplan/leetcode-75/), all implemented in Java.

> **Must-do problem list for interview prep:** The problems selected in this repository are curated based on their frequency of appearance in technical interviews and their relevance in assessing a candidate's problem-solving skills. Mastering these problems can significantly boost your chances of success in coding interviews.

> **Best for 1~3 month of prep time:** Whether you're gearing up for a new job hunt or just looking to brush up on your algorithm skills, this collection of problems is optimally designed to be tackled over a period of one to three months. This duration allows for both in-depth understanding and regular practice, ensuring that you're well-prepared and confident in your problem-solving abilities.

Feel free to explore, practice, and ace your upcoming interviews!

🚧 **Work in Progress** 🚧

This repository is continuously updated. I'll be adding solutions to LeetCode problems on a daily basis. Stay tuned for regular updates and feel free to contribute or provide feedback!

## Table of Contents

- [Project Structure](#project-structure)
- [Problems and Solutions](#problems-and-solutions)
- [Usage](#usage)
- [Contribution](#contribution)
- [Content Rights](#content-rights)
- [License](#license)

## Project Structure

```txt
leetcode-75-solutions-java/
│
├── src/
│ ├── array_string/
│ │ ├── MergeStringsAlternately.java
│ │ ├── GreatestCommonDivisorOfStrings.java
│ │ ├── ...
│ ├── two_pointers/
│ ├── sliding_window/
│ ├── prefix_sum/
│ ├── hash_map_set/
│ ├── stack/
│ ├── queue/
│ ├── linked_list/
│ ├── binary_tree_dfs/
│ ├── binary_tree_bfs/
│ ├── binary_search_tree/
│ ├── graphs_dfs/
│ ├── graphs_bfs/
│ ├── heap_priority_queue/
│ ├── binary_search/
│ ├── backtracking/
│ ├── dp_1d/
│ ├── dp_multidimensional/
│ ├── bit_manipulation/
│ ├── trie/
│ ├── intervals/
│ ├── monotonic_stack/
│ └── ...
│
├── test/
│ ├── array_string/
│ ├── ...
│
└── README.md
```

## Problems and Solutions

| Category               | Problem                                                                                                                                           | Solution                                                                                       | Difficulty |
|------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------|------------|
| Array / String         | [Merge Strings Alternately](https://leetcode.com/problems/merge-strings-alternately/)                                                             | [MergeStringsAlternately.java](src/array_string/MergeStringsAlternately.java)                  | Easy       |
| Array / String         | [Greatest Common Divisor of Strings](https://leetcode.com/problems/greatest-common-divisor-of-strings/)                                           | [GreatestCommonDivisorOfStrings.java](src/array_string/GreatestCommonDivisorOfStrings.java)    | Easy       |
| Array / String         | [Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)                               | [GreatestNumberOfCandies.java](src/array_string/GreatestNumberOfCandies.java)                  | Easy       |
| Array / String         | [Can Place Flowers](https://leetcode.com/problems/can-place-flowers/)                                                                             | [CanPlaceFlowers.java](src/array_string/CanPlaceFlowers.java)                                  | Easy       |
| Array / String         | [Reverse Vowels of a String](https://leetcode.com/problems/reverse-vowels-of-a-string/)                                                           | [ReverseVowelsOfString.java](src/array_string/ReverseVowelsOfString.java)                      | Easy       |
| Array / String         | [Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/)                                                             | [ReverseWordsInString.java](src/array_string/ReverseWordsInString.java)                        | Medium     |
| Array / String         | [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/)                                                       | [ProductExceptSelf.java](src/array_string/ProductExceptSelf.java)                              | Medium     | 
| Array / String         | [Increasing Triplet Subsequence](https://leetcode.com/problems/increasing-triplet-subsequence/)                                                   | [IncreasingTriplet.java](src/array_string/IncreasingTriplet.java)                              | Medium     |
| Array / String         | [String Compression](https://leetcode.com/problems/string-compression/)                                                                           | [StringCompressor.java](src/array_string/StringCompressor.java)                                | Medium     |
| Two Pointers           | [Move Zeroes](https://leetcode.com/problems/move-zeroes/)                                                                                         | [ZeroMover.java](src/two_pointers/ZeroMover.java)                                              | Easy       |
| Two Pointers           | [Is Subsequence](https://leetcode.com/problems/is-subsequence/)                                                                                   | [SubsequenceChecker.java](src/two_pointers/SubsequenceChecker.java)                            | Easy       |
| Two Pointers           | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/)                                                             | [WaterContainer.java](src/two_pointers/WaterContainer.java)                                    | Medium     |
| Two Pointers           | [Max Number of K-Sum Pairs](https://leetcode.com/problems/max-number-of-k-sum-pairs/)                                                             | [MaxOperationsCounter.java](src/two_pointers/MaxOperationsCounter.java)                        | Medium     |
| Sliding Window         | [Maximum Average Subarray I](https://leetcode.com/problems/maximum-average-subarray-i/)                                                           | [MaxAverageSubarrayCalculator.java](src/sliding_window/MaxAverageSubarrayCalculator.java)      | Easy       |
| Sliding Window         | [Maximum Number of Vowels in a Substring of Given Length](https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/) | [MaxVowelSubstringCalculator.java](src/sliding_window/MaxVowelSubstringCalculator.java)        | Medium     |
| Sliding Window         | [Max Consecutive Ones III](https://leetcode.com/problems/max-consecutive-ones-iii/)                                                               | [BinaryArrayMaxOnesCalculator.java](src/sliding_window/BinaryArrayMaxOnesCalculator.java)      | Medium     |
| Sliding Window         | [Longest Subarray of 1's After Deleting One Element](https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/)            | [BinarySubarrayCalculator.java](src/sliding_window/BinarySubarrayCalculator.java)              | Medium     |
| Prefix Sum             | [Find the Highest Altitude](https://leetcode.com/problems/find-the-highest-altitude/)                                                             | [AltitudeCalculator.java](src/prefix_sum/AltitudeCalculator.java)                              | Easy       |
| Prefix Sum             | [Find Pivot Index](https://leetcode.com/problems/find-pivot-index/)                                                                               | [PivotFinder.java](src/prefix_sum/PivotFinder.java)                                            | Easy       |
| Hash Map / Set         | [Find the Difference of Two Arrays](https://leetcode.com/problems/find-the-difference-of-two-arrays/)                                             | [ArraysDifferenceFinder.java](src/hash_map_set/ArraysDifferenceFinder.java)                    | Easy       |
| Hash Map / Set         | [Unique Number of Occurrences](https://leetcode.com/problems/unique-number-of-occurrences/)                                                       | [UniqueOccurrenceChecker.java](src/hash_map_set/UniqueOccurrenceChecker.java)                  | Easy       |
| Hash Map / Set         | [Determine if Two Strings Are Close](https://leetcode.com/problems/determine-if-two-strings-are-close/)                                           | [StringCloseChecker.java](src/hash_map_set/StringCloseChecker.java)                            | Medium     |
| Hash Map / Set         | [Equal Row and Column Pairs](https://leetcode.com/problems/equal-row-and-column-pairs/)                                                           | [MatrixPairs.java](src/hash_map_set/MatrixPairs.java)                                          | Medium     |
| Stack                  | [Decode String](https://leetcode.com/problems/decode-string/)                                                                                     | [StringDecoder.java](src/stack/StringDecoder.java)                                             | Medium     |
| Stack                  | [Asteroid Collision](https://leetcode.com/problems/asteroid-collision/)                                                                           | [AsteroidCollisionSimulator.java](src/stack/AsteroidCollisionSimulator.java)                   | Medium     |
| Stack                  | [Removing Stars From a String](https://leetcode.com/problems/removing-stars-from-a-string/)                                                       | [StarStringProcessor.java](src/stack/StarStringProcessor.java)                                 | Medium     |
| Queue                  | [Number of Recent Calls](https://leetcode.com/problems/number-of-recent-calls/)                                                                   | [RecentCounter.java](src/queue/RecentCounter.java)                                             | Easy       |
| Queue                  | [Dota2 Senate](https://leetcode.com/problems/dota2-senate/)                                                                                       | [SenateDecisionSimulator.java](src/queue/SenateDecisionSimulator.java)                         | Medium     |
| Linked List            | [Delete the Middle Node of a Linked List](https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/)                                 | [LinkedListProcessor.java](src/linked_list/LinkedListProcessor.java)                           | Medium     |
| Linked List            | [Odd Even Linked List](https://leetcode.com/problems/odd-even-linked-list/)                                                                       | [OddEvenLinkedListTransformer.java](src/linked_list/OddEvenLinkedListTransformer.java)         | Medium     |
| Linked List            | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)                                                                         | [LinkedListReverser.java](src/linked_list/LinkedListReverser.java)                             | Easy       |
| Linked List            | [Maximum Twin Sum of a Linked List](https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/)                                             | [MaxTwinSumCalculator.java](src/linked_list/MaxTwinSumCalculator.java)                         | Medium     |
| ...                    | ...                                                                                                                                               | ...                                                                                            | ...        |
| DP - Multidimensional  | [Unique Paths](https://leetcode.com/problems/unique-paths/)                                                                                       | [GridPathFinder.java](src/dp_multidimensional/GridPathFinder.java)                             | Medium     |
| DP - Multidimensional  | [Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/)                                                           | [SubsequenceFinder.java](src/dp_multidimensional/SubsequenceFinder.java)                       | Medium     |
| DP - Multidimensional  | [Best Time to Buy and Sell Stock with Transaction Fee](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/)       | [StockTradingProfitCalculator.java](src/dp_multidimensional/StockTradingProfitCalculator.java) | Medium     |
| DP - Multidimensional  | [Edit Distance](https://leetcode.com/problems/edit-distance/)                                                                                     | [EditDistanceCalculator.java](src/dp_multidimensional/EditDistanceCalculator.java)             | Medium     |
| Bit Manipulation       | [Counting Bits](https://leetcode.com/problems/counting-bits/)                                                                                     | [BitCounter.java](src/bit_manipulation/BitCounter.java)                                        | Easy       |
| Bit Manipulation       | [Single Number](https://leetcode.com/problems/single-number/)                                                                                     | [UniqueNumberFinder.java](src/bit_manipulation/UniqueNumberFinder.java)                        | Easy       |
| Bit Manipulation       | [Minimum Flips to Make a OR b Equal to c](https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/)                                 | [BitFlipCalculator.java](src/bit_manipulation/BitFlipCalculator.java)                          | Medium     |
| Trie                   | [Implement Trie (Prefix Tree)](https://leetcode.com/problems/implement-trie-prefix-tree/)                                                         | [PrefixTrie.java](src/trie/PrefixTrie.java)                                                    | Medium     |
| Trie                   | [Search Suggestions System](https://leetcode.com/problems/search-suggestions-system/)                                                             | [SearchSuggestionsSystem.java](src/trie/SearchSuggestionsSystem.java)                          | Medium     |
| Intervals              | [Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/)                                                             | [IntervalOverlapRemover.java](src/intervals/IntervalOverlapRemover.java)                       | Medium     |
| Intervals              | [Minimum Number of Arrows to Burst Balloons](https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/)                           | [ArrowBalloonBurstOptimizer.java](src/intervals/ArrowBalloonBurstOptimizer.java)               | Medium     |
| Monotonic Stack        | [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/)                                                                           | [TemperatureChangeCalculator.java](src/monotonic_stack/TemperatureChangeCalculator.java)       | Medium     |
| Monotonic Stack        | [Online Stock Span](https://leetcode.com/problems/online-stock-span/)                                                                             | [StockPriceSpanCalculator.java](src/monotonic_stack/StockPriceSpanCalculator.java)             | Medium     |


## Usage

1. Clone the repository:


```bash
git clone https://github.com/teamlead/leetcode-75-solutions-java.git
```

2. Navigate to a specific problem:

```bash
cd src/category_name
```

3. Compile and run the Java solution:

```bash
javac ProblemName.java
java -ea ProblemName
```

or if you use Java11+ run the source code file directly, without intermediate compilation:

```bash
java -ea ProblemName.java
```

If using IDEA, right-click the src folder, then select **"Mark Directory"** as **"Sources Root"**. Now, Java files should benefit from all the Java IDE features of IntelliJ IDEA, including autocomplete, debug, syntax highlighting, and more.

Remember, when using assertions in Java, ensure that you've enabled them by using the `-ea` flag when running the Java program.

## Contribution

Feel free to fork this repository and add your solutions or improvements. Pull requests are welcome!

## Content Rights

The problems discussed in this repository are sourced from LeetCode and are Copyrighted Material owned by [LeetCode](https://leetcode.com/). They are used here for educational purposes only. It is strongly advised not to use them in any other way that might infringe on the intellectual property rights of the original source. Always refer to the original LeetCode link for the complete and most up-to-date problem statement.

## License

This project is open source and available under the [MIT License](LICENSE).
