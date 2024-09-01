public class InOrder {
    static class node{
        int data;
        node left;
        node right;

        public node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
        public static void INOrderOperation(node root)
        {
            if(root==null)
            {
                return;
            }
            INOrderOperation(root.left);
            System.out.println(root.data);
   
            INOrderOperation(root.right);
        }

        public static void main(String[]args)
        {
            node root =new node(1);
            root.left=new node(2);
            root.right=new node(3);
            root.left.left=new node(4);
            root.left.right=new node(5);
            root.right.right=new node(6);

           INOrderOperation(root);
        }
    
}
