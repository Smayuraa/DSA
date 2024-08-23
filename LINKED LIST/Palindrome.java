public class Palindrome {
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

    public Palindrome()
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

 //mid
 public node findmid(node head){
 node slow;
 slow=head;
 node fast;
 fast=head;
 while(fast!=null &&fast.next!=null)
 {
    slow=slow.next;
    fast=fast.next.next;
 }
 return slow;
 }
 public boolean checkPalindrome(){
    //basecase
    if(head==null ||head.next==null)
    {
        return true;
    }

    node midNode=findmid(head);

     //pre,curr(mid),next
     node pre=null;
     node curr=midNode;
     node next;
     while(curr!=null)
     {
       next= curr.next;
       curr.next=pre;
       pre=curr;
       curr=next;
   }
   node left=head;
   node right=pre;

   while(right!=null)
   {
   if(left.data!=right.data)
   {
    return false;
   }
    left=left.next;
    right=right.next;
 }
 return true;
}

  
    public static void main(String[]args)
    {
        Palindrome ll=new Palindrome();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
    //    System.out.println("linkedlist:");
    //    ll.print();
       System.out.println(ll.checkPalindrome());
 
     ll.print();        
    }
    
}
