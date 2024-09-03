public class BuildBST{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data=data;
        }
    }
    public static Node BuildBSTFun(Node root,int val)
    {
        if(root==null)
        {
            return new Node(val);
          
        }
        if(val<root.data)
        {
            root.left=BuildBSTFun(root.left, val);
        }
        else{
            root.right=BuildBSTFun(root.right, val);
        }
        return root;
    }

    public static void InOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
       
        InOrder(root.left);
        System.out.println(root.data);
        InOrder(root.right);

    }
    public static void main(String[]args)
    {
        int val[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<val.length;i++)
        {
            root=BuildBSTFun(root,val[i]);
        }

        InOrder(root);
       
    }
}