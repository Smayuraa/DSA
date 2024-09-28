package TRIE;

public class SearchTrie {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;  
        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }

        public static Node root = new Node();
    }

    public static void insertNode(String word) {
        Node curr = Node.root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;  
    }

    public static boolean searchKey(String key) {
        Node curr = Node.root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;  
            }
            curr = curr.children[idx];
        }
        return curr.eow;  
    }

    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "an", "their"};
        String key = "the";

        for (int i = 0; i < words.length; i++) {
            insertNode(words[i]);
        }

        if (searchKey(key)) {
            System.out.println("The key \"" + key + "\" is present in the trie.");
        } else {
            System.out.println("The key \"" + key + "\" is not present in the trie.");
        }
    }
}
