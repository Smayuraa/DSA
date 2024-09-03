public class SearchBST {
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
    public static boolean SearchKey(Node root,int key)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==key)
        {
            return true;
        }
        if(root.data<key)
        {
            return SearchKey(root.right, key);
        }
        else{
            return SearchKey(root.left, key);
        }
    }
  //print
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

     if(SearchKey(root, 3)) 
     {
        System.out.println("found");
     }       
     else{
        System.out.println("not found");
     }
       
    }
}
