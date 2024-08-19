import java.util.*;
public class PairingProblem {
    public static int TotalPair(int n)
    {
        if(n==1||n==2)
        {
            return n;
        }
        return TotalPair(n-1)+TotalPair(n-1)*TotalPair(n-2);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no: ");
        int n=sc.nextInt();
        System.out.println(TotalPair(n));
    }
}
