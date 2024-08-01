public class BuySellStocks {
    public static int stocks(int arr[])
    {
        int maxprofit=0;
        int buyprice=Integer.MAX_VALUE;
        int profit;
        for(int i=0;i<arr.length;i++)
        {
            if(buyprice<arr[i])
            {
             profit=arr[i]-maxprofit;
             maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buyprice=arr[i];
            }
        }
       return maxprofit;  

    }
    public static void main(String[]args)
    {
        int arr[]={7,1,5,3,6,4};
            System.out.println(stocks(arr));
        
    }
}
