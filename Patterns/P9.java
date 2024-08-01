// 0-1 triangle
// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 

public class P9 {
    public static void main(String[]args)
    {
        int row=4;
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                int sum=i+j;
                if(sum%2==0) 
                {
                    System.out.print("1"+" ");
                }
                else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
}
