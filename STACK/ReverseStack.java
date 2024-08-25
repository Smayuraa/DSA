import java.util.*;
public class ReverseStack {

    public static void BottomPush(Stack<Integer>s,int ele)
    {
        if(s.empty())
        {
        s.push(ele);
        return;

         }
            int top=s.pop();
          BottomPush(s, ele);
          s.push(top);
    }
    public static void  reverse(Stack<Integer>s)
    {
     if(s.empty())
     {
        return;
     }
     int top=s.pop();
     reverse(s);   
     BottomPush(s,top); 
    }
    public static void print(Stack<Integer>s)
    {
        while(!s.empty())
        {
        System.out.println(s.pop());
        }
    }
    public static void main(String[]args)
    {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s);
        print(s);
    }
}
