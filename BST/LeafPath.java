import java.util.*;

public class LeafPath {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node BuildBSTFun(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.data) {
            root.left = BuildBSTFun(root.left, val);
        } else {
            root.right = BuildBSTFun(root.right, val);
        }
        return root;
    }

    public static boolean SearchKey(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data < key) {
            return SearchKey(root.right, key);
        } else {
            return SearchKey(root.left, key);
        }
    }

    // Print InOrder Traversal
    public static void InOrder(Node root) {
        if (root == null) {
            return;
        }
        InOrder(root.left);
        System.out.println(root.data);
        InOrder(root.right);
    }

    // Find and print all paths from root to leaf
    public static void FindPath(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            PrintPath(path);
        } else {
            FindPath(root.left, path);
            FindPath(root.right, path);
        }
        path.remove(path.size() - 1);
    }

    // Print the given path
    public static void PrintPath(ArrayList<Integer> path) {
        if (path == null || path.isEmpty()) {
            return;
        }
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int val[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for (int v : val) {
            root = BuildBSTFun(root, v);
        }
        ArrayList<Integer> path = new ArrayList<>();
        FindPath(root, path);
    }
}
