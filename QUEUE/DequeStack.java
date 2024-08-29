import java.util.*;

class DequeStack {
    Deque<Integer> dq = new LinkedList<>();

    // Pushes an element to the stack
    public void push(int data) {
        dq.addLast(data);
    }

    // Pops an element from the stack
    public void pop() {
        if (!dq.isEmpty()) {
            dq.removeLast();
        } else {
            System.out.println("Stack is empty. Cannot pop.");
        }
    }

    // Peeks the top element of the stack
    public int peek() {
        if (!dq.isEmpty()) {
            return dq.getLast();
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; 
        }
    }

    public static void main(String[] args) {
        DequeStack s = new DequeStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("peek: " + s.peek());
    }

   
}
