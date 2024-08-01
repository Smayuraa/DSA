// Butterfly 
// *                  *
// * *              * *
// * * *          * * *
// * * * *      * * * *
// * * * * *  * * * * *
// * * * * *  * * * * *
// * * * *      * * * *
// * * *          * * *
// * *              * *
// *                  *

public class P11 {
    public static void main(String[]args)
    {
        int row=5;
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
        

      
            //space
            int space=2*(row-i);
            for(int j=1;j<=space;j++)
            {
                System.out.print("  ");
            }
            //star
            for(int j=1;j<=i;j++)
            {
                System.out.print(" "+"*");
            }
            System.out.println();
        }

        //reverse 
        for(int i=row;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
        

      
            //space
            int space=2*(row-i);
            for(int j=1;j<=space;j++)
            {
                System.out.print("  ");
            }
            //star
            for(int j=1;j<=i;j++)
            {
                System.out.print(" "+"*");
            }
            System.out.println();
        }
    }
}

