//Q.count set bit in a number.
public class CountSetBit {
    public static int CountBit(int n,int count)
    {
        while(n>0)
    {
        if((n&1)!=0)
        {
            count++;
        }
        n=n>>1;
    }
        return count;
    }
  public static void main(String args[])
  {
    int n=10,count=0;
   System.out.println( CountBit(10,0));

  }  
}
