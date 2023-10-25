package trie;

public class PrefixTrie {

    class Node {
        char character;
        boolean endOfWord;
        Node[] offspring = new Node[26];

        Node() {}

        Node(char ch) {
            this.character = ch;
        }
    }

    private final Node rootNode;

    public PrefixTrie() {
        rootNode = new Node();
        rootNode.character = ' ';
    }

    public void insert(String term) {
        Node current = rootNode;
        for (char ch : term.toCharArray()) {
            if (current.offspring[ch - 'a'] == null) {
                current.offspring[ch - 'a'] = new Node(ch);
            }
            current = current.offspring[ch - 'a'];
        }
        current.endOfWord = true;
    }

    public boolean search(String term) {
        Node current = rootNode;
        for (char ch : term.toCharArray()) {
            if (current.offspring[ch - 'a'] == null) {
                return false;
            }
            current = current.offspring[ch - 'a'];
        }
        return current.endOfWord;
    }

    public boolean startsWith(String initial) {
        Node current = rootNode;
        for (char ch : initial.toCharArray()) {
            if (current.offspring[ch - 'a'] == null) {
                return false;
            }
            current = current.offspring[ch - 'a'];
        }
        return true;
    }

    public static void main(String[] args) {

        PrefixTrie tree = new PrefixTrie();

        tree.insert("apple");
        assert tree.search("apple");
        assert !tree.search("app");
        assert tree.startsWith("app");

        tree.insert("app");
        assert tree.search("app");

        System.out.println("All tests passed!");
    }
}
