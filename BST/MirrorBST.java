public class MirrorBST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left=null;
            this.right=null;
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
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
       
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

   public static Node Mirror(Node root)
   {
    if(root==null)
    {
        return null;
    }
   Node leftMirror=Mirror(root.left);
   Node rightMirror=Mirror(root.right);

   root.left=rightMirror;
   root.right=leftMirror;
   return root;
   }

  

    public static void main(String[] args) {
        int val[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for (int i = 0; i < val.length; i++) {
            root = BuildBSTFun(root, val[i]);
        }
       root=Mirror(root);
       preOrder(root);
    }
}
