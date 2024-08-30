import java.util.Arrays;

public class MinAbsolute {
    public static void main(String[]args)
    {
        int A[]={4,1,8,7};
        int B[]={2,3,6,5};
        int min=0;
        //sort
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<A.length;i++)
        {
           min+= Math.abs(A[i]-B[i]);
        }
        System.out.println("Minimum Absolute: "+min );
    }
}
