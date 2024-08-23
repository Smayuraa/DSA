public class ReverseLinkedList {
    class node{
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

    public ReverseLinkedList()
    {
        this.head=null;
        this.tail=null;
    }

    public void print()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data){
        node newnode=new node(data);

        if(head==null)
        {
         head=tail=newnode;
         return;
        }
        newnode.next=head;
        head=newnode;
 }

 public  void Reverse(){
    node prev=null;
    node curr=tail=head;
    node next;

    while(curr!=null)
    {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;

 }

 
    public static void main(String[]args)
    {
        ReverseLinkedList ll=new ReverseLinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        System.out.println("linked list: ");
         ll.print();
         System.out.println("Reverse linked list: ");
        ll. Reverse(); 
         ll.print();

    }
}
