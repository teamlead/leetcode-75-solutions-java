package trie;

import java.util.*;

public class SearchSuggestionsSystem {

    class Node {
        Node[] children = new Node[26];
        List<String> recommendations = new ArrayList<>();
    }

    public List<List<String>> suggestedProducts(String[] items, String query) {
        Node primaryNode = new Node();
        for (String item : items) {
            addToTrie(item, primaryNode);
        }
        return findRecommendations(query, primaryNode);
    }

    private void addToTrie(String item, Node rootNode) {
        Node currentNode = rootNode;
        for (char ch : item.toCharArray()) {
            if (currentNode.children[ch - 'a'] == null)
                currentNode.children[ch - 'a'] = new Node();
            currentNode = currentNode.children[ch - 'a'];

            if (currentNode.recommendations.size() < 3) {
                currentNode.recommendations.add(item);
                Collections.sort(currentNode.recommendations);
            }
        }
    }

    private List<List<String>> findRecommendations(String query, Node rootNode) {
        List<List<String>> result = new ArrayList<>();
        for (char ch : query.toCharArray()) {
            if (rootNode != null)
                rootNode = rootNode.children[ch - 'a'];
            result.add(rootNode == null ? new ArrayList<>() : rootNode.recommendations);
        }
        return result;
    }

    public static void main(String[] args) {

        SearchSuggestionsSystem system = new SearchSuggestionsSystem();

        String[] products1 = {"mobile","mouse","moneypot","monitor","mousepad"};
        String searchWord1 = "mouse";
        List<List<String>> result1 = system.suggestedProducts(products1, searchWord1);
        List<List<String>> expected1 = Arrays.asList(
                Arrays.asList("mobile","moneypot","monitor"),
                Arrays.asList("mobile","moneypot","monitor"),
                Arrays.asList("mouse","mousepad"),
                Arrays.asList("mouse","mousepad"),
                Arrays.asList("mouse","mousepad")
        );
        assert result1.equals(expected1);

        String[] products2 = {"havana"};
        String searchWord2 = "havana";
        List<List<String>> result2 = system.suggestedProducts(products2, searchWord2);
        List<List<String>> expected2 = Arrays.asList(
                Arrays.asList("havana"),
                Arrays.asList("havana"),
                Arrays.asList("havana"),
                Arrays.asList("havana"),
                Arrays.asList("havana"),
                Arrays.asList("havana")
        );
        assert result2.equals(expected2);

        System.out.println("All tests passed!");

    }
}
