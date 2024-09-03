public class DeleteNode {
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

    public static Node Delete(Node root, int val) {
        if (root == null) {
            return null;
        }
        
        if (root.data < val) {
            root.right = Delete(root.right, val);
        } else if (root.data > val) {
            root.left = Delete(root.left, val);
        } else {
            // Node to be deleted found
            if (root.left == null && root.right == null) {
                // Case 1: Node is a leaf
                return null;
            } else if (root.left == null) {
                // Case 2: Node has only right child
                return root.right;
            } else if (root.right == null) {
                // Case 2: Node has only left child
                return root.left;
            } else {
                // Case 3: Node has two children
                Node inorderSuccessor = FindInorderSuccessor(root.right);
                root.data = inorderSuccessor.data;
                root.right = Delete(root.right, inorderSuccessor.data);
            }
        }
        return root;
    }

    public static Node FindInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void InOrder(Node root) {
        if (root == null) {
            return;
        }
        InOrder(root.left);
        System.out.println(root.data);
        InOrder(root.right);
    }

    public static void main(String[] args) {
        int val[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for (int i = 0; i < val.length; i++) {
            root = BuildBSTFun(root, val[i]);
        }

        root = Delete(root, 4);
        InOrder(root);
    }
}
