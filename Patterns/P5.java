// Inverted half pyramid
//    *
//   **
//  ***
// ****


public class P5 {
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
        //star
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
            System.out.println();

        
    }

}
}