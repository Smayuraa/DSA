package TRIE;

public class WordBreakProblem {
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

    public static boolean wordBreakFun(String key) {
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {  // Corrected loop range
            if (searchKey(key.substring(0, i)) && wordBreakFun(key.substring(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String words[] = {"i", "love", "mango", "an", "their"};
        for (String word : words) {
            insertNode(word.toLowerCase());  
        }
        String key = "Ilovemango".toLowerCase();  
        System.out.println(wordBreakFun(key));
    }
}
