public class ArrToBalancedBST {
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
    public static Node BalancedBst(int arr[],int st,int end)
    {
        if(st>end)
        {
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(arr[mid]);
        root.left=BalancedBst(arr, st, mid-1);
        root.right=BalancedBst(arr,mid+1, end);
        return root;
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
        int arr[]={3,5,6,8,10,11,12};
        Node root=BalancedBst(arr, 0, arr.length-1);
        preOrder(root);

    }
    
}
