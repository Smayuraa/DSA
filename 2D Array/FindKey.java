import java.util.Scanner;

public class FindKey {

    public static void FindKeyFun(int matrix[][],int n,int m,int key)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==key)
                System.out.println("key is found at index: "+"("+ i +","+ j +")");
            }
        }

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
        FindKeyFun(matrix,n,m,key);

    }
}
