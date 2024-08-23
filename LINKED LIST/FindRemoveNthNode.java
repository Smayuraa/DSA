public class FindRemoveNthNode {
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

    public FindRemoveNthNode()
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

  public void deleteNthNode(int n)
  {
    int size=0;
    node temp=head;
    while(temp!=null)
    {
        temp=temp.next;
        size++;
    }

    if(n==size)
    {
     head=head.next;
    return;
    }

    int i=1;
    int find=size-n;
    node prev=head;
    while(i<find){
        prev=prev.next;
        i++;
    }
    prev.next=prev.next.next;
    return;

  }
    public static void main(String[]args)
    {
        FindRemoveNthNode ll=new FindRemoveNthNode();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
       System.out.println("linkedlist:");
       ll.print();
       System.out.println("deleted linkedlist");
     ll.deleteNthNode(3);
     ll.print();        
    }
    
}
