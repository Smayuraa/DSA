import java.util.Queue;

import javax.management.Query;

public class LinkedListImp{
    class node{
        int data;
        node next;
    
    public node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public static  node head;
public static  node tail;

public  LinkedListImp()
{
    this.head=null;
    this.tail=null;
}

//empty
public static boolean isEmpty()
{
    return head==null;
}

//add
public void add(int data)
{
    node newNode=new node(data);
    if(head==null)
    {
        head=tail=newNode;
        return;
    }
   else{
    tail.next=newNode;
    tail=newNode;
   }
}

//remove
public static int remove()
{
    if(isEmpty())
    {
        System.out.println("already empty!");
        return -1;
    }
    int front=head.data;
    if(head==null)
    {
        head=tail=null;
    }
    else{
        head=head.next;

    }
    return front;
}

//peek
public static int peek()
{
    if(isEmpty())
    {
        System.out.println("empty");
        return -1;
    }
    return head.data;
}

public static void main(String[]args)
{
    LinkedListImp q=new LinkedListImp();

    q.add(1);
    q.add(2);
    q.add(3);
    while(!q.isEmpty())
    {
        System.out.println(q.peek());
        q.remove();
    }
}
}