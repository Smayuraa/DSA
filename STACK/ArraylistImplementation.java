import java.util.*;
public class ArraylistImplementation{
   
       static  ArrayList<Integer>list=new ArrayList<>();
        //isempty
        public static boolean isEmpty()
        {
            if(list.size()==0)
            {
              return true;
            }
            return false;
        }

        //push
        public static void push(int data)
        {
            list.add(data);
        }
        //pop
        public static int pop()
        {
            if(isEmpty())
            {
                System.out.println("stack is empty");
                return -1;
            }
            int top=list.size()-1;
            list.remove(list.size()-1);
            return top;
        }
        //peek
        public static void peek()
        {
            if(isEmpty())
            {
                System.out.println("stack is empty");
                return ;
            }
            list.get(list.size()-1);
        }
    

    public static void main(String[]args)
    {
      Stack s=new Stack();
      s.push(1);
      s.push(2);
      s.push(3);
      s.push(4);
      while(!s.isEmpty())
      {
        System.out.println(s.peek());
        s.pop();
      }

    }
}