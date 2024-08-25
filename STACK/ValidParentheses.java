import java.util.*;
public class ValidParentheses {

    public static boolean Validation(String str)
    { 
        Stack<Character>s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            if(ch=='('||ch=='{'||ch=='[')
            {
                s.push(ch);
            }
            else if(s.isEmpty())
            {
                return false;
            }
            else{
            char top=s.peek();

            if(top=='{'&&ch=='}'||top=='['&&ch==']'|| top=='('&&ch==')')
            {
                s.pop();
            }
            else{
                return false;
            }
        } 

        }
        return s.isEmpty();

    }
    public static void main(String[]args)
    {
        String str="({})[]";
        System.out.println(Validation(str));
        // for(int i=0;i<str.length();i++)
        // {
        //     System.out.println(str.charAt(i));
        // }
    }
}
