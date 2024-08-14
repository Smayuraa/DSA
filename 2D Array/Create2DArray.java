import java.util.Scanner;


public class Create2DArray {

    public static void MyArray(int matrix[][])
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[]args)
    {
        int matrix[][]=new int[5][4];
        // int n=matrix.length;
        // int m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter elements: ");
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        MyArray(matrix);
    }
}
