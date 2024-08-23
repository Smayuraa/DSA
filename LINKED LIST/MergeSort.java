import java.util.LinkedList;
import java.util.Collection;

public class MergeSort {
    static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public node head;
    public node tail;

    public MergeSort() {
        this.head = null;
        this.tail = null;
    }


    public static void print(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Get the middle node
    public node getMid(node head) {
        node slow = head;
        node fast = head.next; 
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    // Merge two sorted linked lists
    public node mergeFun(node h1, node h2) {
        node mll = new node(-1); 
        node temp = mll;
        while (h1 != null && h2 != null) {
            if (h1.data <= h2.data) {
                temp.next = h1;
                h1 = h1.next;
            } else {
                temp.next = h2;
                h2 = h2.next;
            }
            temp = temp.next;
        }
        while (h1 != null) {
            temp.next = h1;
            h1 = h1.next;
            temp = temp.next;
        }
        while (h2 != null) {
            temp.next = h2;
            h2 = h2.next;
            temp = temp.next;
        }
        return mll.next; 
    }

    // Merge Sort function
    public node mergeSortFun(node head) {
        if (head == null || head.next == null) {
            return head; 
        }
        node mid = getMid(head);
        node rightHead = mid.next;
        mid.next = null; 
        node newLeft = mergeSortFun(head); 
        node newRight = mergeSortFun(rightHead); 
        return mergeFun(newLeft, newRight); 
    }

    public static void main(String[] args) {
       MergeSort ll = new MergeSort();
        ll.head = new node(4);
        ll.head.next = new node(2);
        ll.head.next.next = new node(1);
        ll.head.next.next.next = new node(3);
      
        ll.head = ll.mergeSortFun(ll.head);
        ll.print(ll.head);
    }
}
