public class LargestNo {
    public static int find(int arr[])
    {   int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(largest<arr[i])
            {
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[]args)
    {
        int arr[]={2,3,4,5,56,22};
        System.out.println("large no: " + find(arr));
    }
}
