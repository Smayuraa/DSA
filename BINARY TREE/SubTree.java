public class SubTree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isIdentical(Node node, Node subroot) {
        if (node == null && subroot == null) {
            return true;
        } else if (node == null || subroot == null) {
            return false;
        }

        // Check if current nodes' data are equal
        if (node.data != subroot.data) {
            return false;
        }

        // Recursively check left and right subtrees
        return isIdentical(node.left, subroot.left) && isIdentical(node.right, subroot.right);
    }

    public static boolean subTree(Node root, Node subroot) {
        if (root == null) {
            return false;
        }

        // If current nodes are identical
        if (isIdentical(root, subroot)) {
            return true;
        }

        // Recursively check left and right subtrees
        return subTree(root.left, subroot) || subTree(root.right, subroot);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        System.out.println("Is subtree: " + subTree(root, subroot));
    }
}
