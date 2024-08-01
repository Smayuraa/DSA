public class Subarrays {

    public static void subArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int curr1=i;
            for(int j=i;j<arr.length;j++)
            {
                int curr2=j;
                for(int k=curr1;k<=curr2;k++)
                {
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
            System.out.println();
        }
        
    }
    public static void main(String[]args)
    {
        int arr[]={2,4,6,8};
        subArr(arr);
    }
}
