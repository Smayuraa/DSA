// palindromic pattern
//    1
//   212
//  32123
// 4321234

public class P14 {
    public static void main(String[]args)
    {
        int row=4;
        for(int i=1;i<=row;i++)
        {
            //space
            int space=row-i;
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            //no
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
