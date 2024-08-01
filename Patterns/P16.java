//      * 
//    * * *
//   * * * * *
// * * * * * * *
// * * * * * * *
//   * * * * *
//    * * *
//      *
public class P16 {
    public static void main(String[]args)
    {
        int row=4;
        for(int i=1;i<=row;i++)
        {
            //space
            for(int j=1;j<=2*(row-i);j++)
            {
                System.out.print(" ");
            }
            //star
             int star=2*i-1;
            for(int j=1;j<=star;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=row;i>=1;i--)
        {
            for(int j=1;j<=row-i;j++)
            {
                System.out.print(" ");
            }
            int star=2*i-1;
            for(int j=1;j<=star;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
