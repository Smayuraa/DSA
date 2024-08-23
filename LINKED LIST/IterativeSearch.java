public class IterativeSearch {
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

    public IterativeSearch()
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

 public static int findKey(int key)
 {
    node temp=head;
    int i=0;
    while(temp!=null)
    {
        if(temp.data==key)
        {
            return i;
        }
        temp=temp.next;
        i++;

    }
    return -1;
 }
    public static void main(String[]args)
    {
        IterativeSearch ll=new IterativeSearch();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);

      //  ll.print();

    System.out.println("key fount at index: "+ findKey(3));        

    }
}
