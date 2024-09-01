
public class DiameterOfTree {

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
    
            public static int Height(Node root)
            {
                if(root==null)
                {
                    return 0;
                }
                int left=Height(root.left);
                int right=Height(root.right);
                 int answer=Math.max(left,right)+1;
                 return answer;
                
            }
            public static int Diameter(Node root)
            {
                if(root==null)
                {
                    return 0;
                }
                int leftD=Diameter(root.left);
                int left=Height(root.left);
                int rightD=Diameter(root.right);
                int right=Height(root.right);
                int selfD=left+right+1;
                 int answer=Math.max(selfD,Math.max(leftD,rightD));
                 return answer;
            }
        
        public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.right = new Node(6);
            System.out.println("Height: " + Diameter(root));
    
        }
    }
    
