import java.util.Scanner;

public class FibonacciNo {

    public static void FindFibonacciNo(int a,int b,int n)
    {
        if(n==0)
        {
            return ;
        }
       int c=a+b;
       System.out.println(c);
         FindFibonacciNo(b, c, n-1);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter a no: ");
       int n=sc.nextInt();
       int a=0,b=1;
       System.out.println(a);
       System.out.println(b);
       FindFibonacciNo(a,b,n-2);
    }
}
