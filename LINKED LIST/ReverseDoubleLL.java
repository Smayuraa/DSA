public class ReverseDoubleLL {
    class node{
        int data;
        node next;
        node prev;
    
    public node(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public node head;
public node tail;
public ReverseDoubleLL()
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
public void Reverse()
{
    node curr=head;
    node prev=null;
    node next;

    while(curr!=null)
    {
        next=curr.next;
        curr.next=prev;
        curr.prev=next;

        prev=curr;
        curr=next;
    }
    head=prev;

}

    public static void main(String[]args)
    {
    ReverseDoubleLL ll=new ReverseDoubleLL();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.addFirst(4);
    System.out.println("orignal linkedlist:");
    ll.print();
    System.out.println("reverse linkedlist:");
    ll.Reverse();
    ll.print();
    }
}
