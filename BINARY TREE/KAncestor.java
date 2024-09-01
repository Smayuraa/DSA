public class KAncestor {
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

    public static int KAncestorFun(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }
        
        if (root.data == n) {
            return 0;
        }

        int left = KAncestorFun(root.left, n, k);
        int right = KAncestorFun(root.right, n, k);

        if (left == -1 && right == -1) {
            return -1;
        }

        int Max = Math.max(left, right);

        if (Max + 1 == k) {
            System.out.println(root.data);
        }

        return Max + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        KAncestorFun(root, 4, 2);
    }
}
