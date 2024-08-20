public class Permutation {
    public static void PermutationFun(String str,String ans)
    {
        //basecase
        if(str.length()==0)
        {
            printArr(ans);
            return;
        }
      for(int i=0;i<str.length();i++)
      {
        char curr=str.charAt(i);
        String newStr=str.substring(0,i)+str.substring(i+1);
        PermutationFun(newStr, ans+curr);
      }
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
       String str="abc";
       String ans=" ";
       PermutationFun(str,ans);//i==0
        printArr(str);

    }
}
