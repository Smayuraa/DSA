package String;
import java.util.*;

public class Palindrome {
    public static boolean checkPalindrome(String name)
    {    
        for(int i=0;i<name.length()/2;i++)
        {
             int n=name.length();
             if(name.charAt(i)==name.charAt(n-i-1))
             {
             return true;
             }
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      System.out.println("enter a string: ");
      String name=sc.next();

     if ( checkPalindrome(name))
    {
        System.out.println("palindrome");
    }
    else{
        System.out.println("not palindrome");
    }
    }
    
}
