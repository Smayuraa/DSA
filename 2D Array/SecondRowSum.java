import java.util.*;
public class SecondRowSum {
    
    public static void SumFun(int matrix[][])
    {   
        int sum=0;
       
            for(int j=0;j<matrix[1].length;j++)
            {
               sum+=matrix[1][j];
            }
            System.out.println(sum);
        }

    
    public static void main(String[]args)
    {
        int key=8;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array n:"+" ");
        int n=sc.nextInt();
        System.out.println("enter the size of array m:"+" ");
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        n=matrix.length;
        m=matrix[0].length;
        System.out.println("enter elements:"+" ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
             matrix[i][j]=sc.nextInt();
            }
        }
        SumFun(matrix);

    }
}

