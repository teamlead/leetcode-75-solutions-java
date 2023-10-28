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

| Category       | Problem                                                                                                             | Solution                                                                                    | Difficulty |
|----------------|---------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------|------------|
| Array / String | [Merge Strings Alternately](https://leetcode.com/problems/merge-strings-alternately/)                               | [MergeStringsAlternately.java](src/array_string/MergeStringsAlternately.java)               | Easy       |            |
| Array / String | [Greatest Common Divisor of Strings](https://leetcode.com/problems/greatest-common-divisor-of-strings/)             | [GreatestCommonDivisorOfStrings.java](src/array_string/GreatestCommonDivisorOfStrings.java) | Easy       |            |
| Array / String | [Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/) | [GreatestNumberOfCandies.java](src/array_string/GreatestNumberOfCandies.java)               | Easy       |            |
| Array / String | [Can Place Flowers](https://leetcode.com/problems/can-place-flowers/)                                               | [CanPlaceFlowers.java](src/array_string/CanPlaceFlowers.java)                               | Easy       |            |
| Array / String | [Reverse Vowels of a String](https://leetcode.com/problems/reverse-vowels-of-a-string/)                             | [ReverseVowelsOfString.java](src/array_string/ReverseVowelsOfString.java)                   | Easy       |            |
| Array / String | [Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/)                               | [ReverseWordsInString.java](src/array_string/ReverseWordsInString.java)                     | Medium     |            |
| ...            | ...                                                                                                                 | ...                                                                                         | ...        |            |
| Trie           | [Implement Trie (Prefix Tree)](https://leetcode.com/problems/implement-trie-prefix-tree)                            | [PrefixTrie.java](src/trie/PrefixTrie.java)                                                 | Medium     |            |
| Trie           | [Search Suggestions System](https://leetcode.com/problems/search-suggestions-system)                                | [SearchSuggestionsSystem.java](src/trie/SearchSuggestionsSystem.java)                       | Medium     |            |
| ...            | ...                                                                                                                 | ...                                                                                         | ...        |            |

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

If using IDEA, right-click the src folder, then select "Mark Directory" as "Sources Root". Now, Java files should benefit from all the Java IDE features of IntelliJ IDEA, including autocomplete, syntax highlighting, and more.

Remember, when using assertions in Java, ensure that you've enabled them by using the `-ea` flag when running the Java program.

## Contribution

Feel free to fork this repository and add your solutions or improvements. Pull requests are welcome!

## Content Rights

The problems discussed in this repository are sourced from LeetCode and are Copyrighted Material owned by [LeetCode](https://leetcode.com/). They are used here for educational purposes only. It is strongly advised not to use them in any other way that might infringe on the intellectual property rights of the original source. Always refer to the original LeetCode link for the complete and most up-to-date problem statement.

## License

This project is open source and available under the [MIT License](LICENSE).
