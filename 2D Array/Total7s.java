import java.util.*;
public class Total7s {
   
    public static void FindFun(int matrix[][],int n,int m,int key)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==key)
                count++;
            }
        }
        System.out.println("total 7's: "+count);

    }
    public static void main(String[]args)
    {
        int key=7;
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
        FindFun(matrix,n,m,key);

    }
    }
    



