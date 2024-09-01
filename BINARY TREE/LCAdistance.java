public class LCAdistance {
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

    // Function to find the LCA of two nodes n1 and n2
    public static Node LCAFun(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftLca = LCAFun(root.left, n1, n2);
        Node rightLca = LCAFun(root.right, n1, n2);

        if (leftLca == null) {
            return rightLca;
        }
        if (rightLca == null) {
            return leftLca;
        }
        return root;
    }

    public static int LCADist(Node root, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }

        int leftDist = LCADist(root.left, n);
        int rightDist = LCADist(root.right, n);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        } else if (leftDist == -1) {
            return rightDist + 1;
        } else {
            return leftDist + 1;
        }
    }

    public static int minDist(Node root, int n1, int n2) {
        Node LCA = LCAFun(root, n1, n2);
        int left = LCADist(LCA, n1); 
        int right = LCADist(LCA, n2); 
        return left + right;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        Node lcaNode = LCAFun(root, 4, 6);
        System.out.println("LCA of 4 and 6: " + lcaNode.data);

        int distance = minDist(root, 4, 6);
        System.out.println("Minimum distance between 4 and 6: " + distance);
    }
}
