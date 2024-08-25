import java.util.Stack;

class StockSpanProblem{

    public static void StockSpan(int stock[],int span[])
    {
        Stack<Integer>s=new Stack<>();
        s.push(0);
        span[0]=1;
        for(int i=1;i<stock.length;i++)
        {
            int curr=stock[i];
            while(!s.isEmpty()&&curr>=stock[s.peek()])
            {
                s.pop();
            }

            if(s.isEmpty())
            {
                span[i]=i+1;
            }
            else{
                span[i]=i-s.peek();
            }
            s.push(i);

        }

    }
    public static void main(String[]args)
    {
        int stock[]={100,80,60,70,60,85,100};
        int span[]=new int[stock.length];
        StockSpan(stock,span);

        for(int i=0;i<span.length;i++)
        {
            System.out.println(span[i]);
        }
    }
}