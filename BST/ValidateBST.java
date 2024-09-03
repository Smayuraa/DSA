public class ValidateBST {
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

   public static boolean Validate(Node root , Node min ,Node max)
   {
    if(root==null)
    {
        return true;
    }
    if(min!=null&&root.data<=min.data)
    {
        return false;
    }
    if(max!=null&&root.data>=max.data)
    {
        return false;
    }
    return Validate(root.left, min, root)&&Validate(root.right, root, max);

   }

  

    public static void main(String[] args) {
        int val[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for(int i=0;i<val.length;i++)
        {
            root=BuildBSTFun(root, i);
        }

       
        if(Validate(root, null,null))
        {
            System.out.println("valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
