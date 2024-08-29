import java.util.*;
public class DequeQueue {

    Deque<Integer> dq = new LinkedList<>();

    // Pushes an element to the stack
    public void add(int data) {
        dq.addLast(data);
    }

    // Pops an element from the stack
    public void remove() {
        if (!dq.isEmpty()) {
            dq.removeFirst();
        } else {
            System.out.println("Stack is empty. Cannot pop.");
        }
    }

    // Peeks the top element of the stack
    public int get() {
        if (!dq.isEmpty()) {
            return dq.getFirst();
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return a default value or handle this as per your requirement
        }
    }

    public static void main(String[] args) {
        DequeQueue q = new DequeQueue();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println("get: " + q.get());
    }
}


