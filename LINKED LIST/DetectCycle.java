public class DetectCycle {
    static class node{
        int data;
        node next;
        public node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
    public node tail;

 public static boolean isCycle(){
    if(head==null)
    {
        System.out.println("linkedlist is empty..!");
        return false;
    }
    node slow=head;
    node fast=head;
    while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;

        if(slow==fast)
        {
            return true;
        }
    }
   
    return false;
 }
  
    public static void main(String[]args)
    {
        DetectCycle ll = new DetectCycle();
        head = new node(1);
        head.next = new node(2);
        head.next.next = new node(3);
        head.next.next.next = head; // Creating a cycle

        System.out.println("Cycle detected: " + ll.isCycle());
    }

    public char[] removeCycle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeCycle'");
    }
}
