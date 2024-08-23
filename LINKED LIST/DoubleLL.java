public class DoubleLL {
    class node{
        int data;
        node next;
        node prev;

        public node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }

    }
    public node head;
    public node tail;

    public DoubleLL()
    {
        this.head=null;
        this.tail=null;
    }
    public void print()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data)
    {
        node newnode=new node(data);
        if(head==null)
        {
          head=tail=newnode;
          return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }

    public void removeFirst(int data)
    {
        if(head==null)
        {
            System.out.println("empty..!");
            return;
        }

        if(head==tail)
        {
            head=tail=null;
        }
        else{
            head=head.next;
            head.prev=null;
        }
    }
    public static void main(String[]args)
    {
        DoubleLL ll=new DoubleLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.print();
    }
    
}
