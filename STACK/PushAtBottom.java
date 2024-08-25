import java.util.*;
public class PushAtBottom {

    public static void PushAtBottomFun(Stack<Integer>s,int ele)
    {
        if(s.empty())
        {
            s.push(ele);
            return;
        }
        else{
            int top=s.pop();
            PushAtBottomFun(s, ele);
            s.push(top);
        }
    }
    public static void main(String[]args)
    {
   Stack<Integer>s=new Stack<>();
   s.push(1);
   s.push(2);
   s.push(3);
   PushAtBottomFun(s,0);

   while(!s.empty())
   {
    System.out.println(s.pop());
   }
    }
}
