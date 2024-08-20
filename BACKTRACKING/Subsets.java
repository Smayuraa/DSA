//Q. subset of "abcd"--> abcd, abc, abd, ab, acd, ac, ad, a, bcd, bc, bd, b, cd, c, d, 

public class Subsets {
    public static void SubsetFun(String str,String ans,int i)
    {
        //basecase
        if(i==str.length())
        {
            printArr(ans);
            return;
        }
       //yes 
       SubsetFun(str, ans+str.charAt(i), i+1);
       //no
       SubsetFun(str, ans, i+1);
    }
    public static void printArr(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[]args)
    {
       String str="abcd";
       String ans=" ";
       SubsetFun(str,ans,0);//i==0
        printArr(str);

    }
}
