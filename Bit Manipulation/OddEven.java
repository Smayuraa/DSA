import java.util.Scanner;

public class OddEven {
    public static boolean checkNo(int n)
    {
        int bitmask=1;
        if((n&bitmask)==0)
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n=sc.nextInt();
       // System.out.println(checkNo(n));
        if(checkNo(n))
        {
            System.out.println(n +" is even");
        }
        else{
            System.out.println(n +"is odd");

        }
    }
}
