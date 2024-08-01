// character 
// a 
// b c 
// d e f 
// g h i j 
public class P17 {
   public static void main(String[]args){
    int row=4;
    char ch='a';
    for(int i=1;i<=row;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(ch+" ");
            ch++;
        }
        System.out.println();
    }
}
}
