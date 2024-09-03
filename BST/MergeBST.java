import java.util.ArrayList;

public class MergeBST {
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

    // Function to perform in-order traversal and store the elements in an ArrayList
    public static void InOrder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        InOrder(root.left, arr);
        arr.add(root.data);
        InOrder(root.right, arr);
    }

    // Function to construct a balanced BST from a sorted ArrayList
    public static Node BalancedBst(ArrayList<Integer> arr, int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = BalancedBst(arr, st, mid - 1);
        root.right = BalancedBst(arr, mid + 1, end);
        return root;
    }

    // Function to merge two BSTs into a balanced BST
    public static Node MergeBSTFun(Node root1, Node root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        InOrder(root1, arr1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        InOrder(root2, arr2);

        // Merge two sorted arrays into one sorted array
        int i = 0, j = 0;
        ArrayList<Integer> finalarr = new ArrayList<>();
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                finalarr.add(arr1.get(i));
                i++;
            } else {
                finalarr.add(arr2.get(j));
                j++;
            }
        }

        // Add remaining elements from arr1
        while (i < arr1.size()) {
            finalarr.add(arr1.get(i));
            i++;
        }

        // Add remaining elements from arr2
        while (j < arr2.size()) {
            finalarr.add(arr2.get(j));
            j++;
        }

        // Construct a balanced BST from the merged sorted array
        return BalancedBst(finalarr, 0, finalarr.size() - 1);
    }

    public static void main(String[] args) {
        // Example usage
        Node root1 = new Node(3);
        root1.left = new Node(1);
        root1.right = new Node(5);

        Node root2 = new Node(4);
        root2.left = new Node(2);
        root2.right = new Node(6);

        Node mergedRoot = MergeBSTFun(root1, root2);
        ArrayList<Integer> mergedInOrder = new ArrayList<>();
        InOrder(mergedRoot, mergedInOrder);

        System.out.println("In-order traversal of the merged balanced BST:");
        for (int value : mergedInOrder) {
            System.out.print(value + " ");
        }
    }
}
