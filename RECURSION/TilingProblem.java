public class TilingProblem {
    public static int MyFun(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        return MyFun(n-1)+MyFun(n-2);
    }
    public static void main(String args[])
    {
        int n=3;
       System.out.println( MyFun(n));
    }
}
