 import java.util.*;
public class DiagonalSum {

    public static void sumFun(int arr[][],int n,int m)
    {  
        int sum=0;
        for(int i=0;i<=n;i++ )
        {
            for(int j=0;j<=m;j++)
            {
                //primary
                if(i==j)
                {
                 sum+=arr[i][j];
                }
                else if(i+j==3)
                {
                  sum+=arr[i][j];
                }
            }
        }
        System.out.println("sum is: "+sum);


    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n: ");
        int n=sc.nextInt();
        System.out.println("enter value of m: ");
        int m=sc.nextInt();
        int arr[][]=new int [n][m];
        n=arr.length-1;
        m=arr[0].length-1;
        System.out.println("enter elements: ");
        for(int i=0;i<=n;i++ )
        {
            for(int j=0;j<=m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        sumFun(arr,n,m);
    } 
}
