public class Transform {
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

    public static int TransformFun(Node root)
    {
        if(root==null)
        {
            return -1;
        }
        int leftch=TransformFun(root.left);
        int rightch=TransformFun(root.right);
        int data=root.data;
        int newleft=root.left==null?0:root.left.data;
        int newRight=root.right==null?0:root.right.data;

        root.data=newleft+leftch+newRight+rightch;
        return data;
    }
    public static void preOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        TransformFun(root);
        preOrder(root);

    }
}
