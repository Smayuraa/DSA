public class RemoveCycle {
    static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static node head;
    public node tail;

    public void removeCycle() {
        node slow = head;
        node fast = head;
        boolean cycle = false;

        // Detecting cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        // If no cycle found, return
        if (!cycle) {
            return;
        }

        // Removing the cycle
        slow = head;
        node prev = null;

        
        if (slow == fast) {
        
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null; // Remove the cycle
            return;
        }

        while (slow != fast) {
            prev = fast;  
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null; // Remove the cycle
    }

    public void print() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        RemoveCycle ll = new RemoveCycle();
        head = new node(1);
        head.next = new node(2);
        head.next.next = new node(3);
        head.next.next.next = head; 

        ll.removeCycle();
        ll.print();
    }
}
