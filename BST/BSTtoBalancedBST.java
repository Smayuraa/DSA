import java.util.ArrayList;

public class BSTtoBalancedBST {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void InOrder(Node root,ArrayList<Integer>arr)
    {
        if(root==null)
        {
            return;
        }
        InOrder(root.left, arr);
        arr.add(root.data);
        InOrder(root.right, arr);
    }
    public static Node BalancedBst(ArrayList<Integer>arr,int st,int end)
    {
        if(st>end)
        {
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(arr.get(mid));
        root.left=BalancedBst(arr, st, mid-1);
        root.right=BalancedBst(arr,mid+1, end);
        return root;
    }
    public static Node getBalanceBst(Node root)
    {
        ArrayList<Integer>arr=new ArrayList<>();
        InOrder(root, arr);
       return BalancedBst(arr, 0, arr.size()-1);
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
    public static void main(String[]args)
    {
        Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);
       root= getBalanceBst(root);
        preOrder(root);
    }
}
