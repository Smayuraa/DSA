// star pyramid
//    * 
//   * * 
//  * * * 
// * * * *

public class P13 {
    public static void main(String[]args)
    {
        int rows=4;
        for(int i=1;i<=rows;i++)
        {
            //space
            int space=rows-i;
         for(int j=1;j<=space;j++)
         {
            System.out.print(" ");
         }
         //star
         for(int j=1;j<=i;j++)
         {
            System.out.print("*"+" ");
         }
         System.out.println();
        }
    }
}
