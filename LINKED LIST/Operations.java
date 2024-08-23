import java.util.LinkedList;

class Operations{
    //class
    class node{
        int data;
        node next;
    //constructor
    public node(int data){
        this.data=data;
        this.next=null;
    }
  }
  //create head and tail
    public node head;
    public node tail;
   //constructor
    public Operations(){
        this.head=null;
        this.tail=null;
    }
    //print
    public void print(){
        if(head==null)
        {
            System.out.println("empty");
            return;
        }
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
   //operation->addFirst
    public void addFirst(int data){
        
        node newnode=new node(data);
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        else{
        newnode.next=head;
        head=newnode;
        }
    }
   //operation->addLast

    public void addLast(int data){
        node newnode=new node(data);
        if(tail==null)
        {
            head=tail=newnode;
            return;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
    }
   //operation->add (middle)

    public void add(int idx,int data)
    {
        node newnode=new node(data);
        node temp=head;
        int i=0;
        while(i<idx-1)
        {
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
   //operation->removeFirst

    public void removeFirst(){
        if(head==null)
        {
            System.out.println("empty");
            return;
        }
        else{
            head=head.next;
        }
    }
   //operation->removeLast

    public void removeLast(){
        node curr=head;
        if(curr==null)
        {
            System.out.println("empty");
            return;
        }
      if(curr.next==null)
        {
            head=null;
            return;
        }
        while(curr.next.next!=null)
        {
            curr=curr.next;
        }
        curr.next=null;
        
    }
    public static void main(String[]args)
    {
        //create linkedlist
        Operations ll=new Operations();

        ll.addFirst(2);
       // ll.print();
        ll.addFirst(1);
        //ll.print();
        ll.addLast(3);
       // ll.print();
        ll.addLast(4);
       // ll.print();
        ll.add(3,10);
       // ll.print();
        ll.add(4,7);
        ll.addFirst(20);  ll.addFirst(21);  ll.addFirst(22);
        ll.print();

        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();

     }
}