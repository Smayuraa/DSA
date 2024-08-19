import java.util.Scanner;

class FactorialNo{

    public static int MyFact(int n)
    {
        //basecase
        if(n==1)
        {
            return n;
        }
        return n*MyFact(n-1);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in) ;
         System.out.println("enter a no: ");
         int n=sc.nextInt();

       System.out.println( MyFact(n));
    }
}