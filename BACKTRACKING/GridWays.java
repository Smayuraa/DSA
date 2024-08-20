public class GridWays {
    public static int gridways(int i,int j,int n,int m)
    {
        if(i==n-1 ||j==m-1)
        {
            return 1;
        }
        else if(i==n||j==m){
            return 0;
        }
        //right
        int w1=gridways(i, j+1, n, m);
        //down
       int w2= gridways(i+1, j, n, m);
       int sum=w1+w2;
       return sum;
    }
    public static void main(String[]args)
    {
        int n=3,m=3;
       System.out.println( gridways(0,0,n,m));
    }
}
