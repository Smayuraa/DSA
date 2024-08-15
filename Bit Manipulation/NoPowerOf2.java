//Q. check if no is a power of 2 or not

import java.util.Scanner;

public class NoPowerOf2 {
public static boolean checkNo(int n)
{
   return ((n&n-1)==0);
}

public static void main(String[]args)
{
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n=sc.nextInt();
       System.out.println( checkNo(n));
}
}
