// solid rhombus
//         *****
//       *****
//     *****
//   *****
// *****

public class P10 {
    public static void main(String[]args)
    {
        int row=5;
        for(int i=1;i<=row;i++)
        {
            //space
            int space=2*(row-i);
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=row;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
