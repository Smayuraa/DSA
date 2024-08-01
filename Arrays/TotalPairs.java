public class TotalPairs {
    public static int Pairs(int arr[])
    {   
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                count++;
            }
        }
        return count;
    }
     public static void main(String[]args)
     {
        int arr[]={2,4,6,8,10};
       
        System.out.println("total pairs: "+  Pairs(arr));
     }
}
