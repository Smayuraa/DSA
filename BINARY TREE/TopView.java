import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopView {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class Info {
        Node node;
        int hd;

        public Info(int hd, Node node) {
            this.hd = hd;
            this.node = node;
        }
    }

    public static void TopViewFun(Node root) {
        if (root == null) return;  // Edge case: if the tree is empty

        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max = 0;
        q.add(new Info(0, root));

        while (!q.isEmpty()) {
            Info curr = q.remove();

            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node);
            }

            if (curr.node.left != null) {
                q.add(new Info(curr.hd - 1, curr.node.left));
                min = Math.min(min, curr.hd - 1);
            }

            if (curr.node.right != null) {
                q.add(new Info(curr.hd + 1, curr.node.right));
                max = Math.max(max, curr.hd + 1);
            }
        }

        for (int i = min; i <= max; i++) { // Changed to `<=` to include `max`
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        TopViewFun(root);
    }
}
