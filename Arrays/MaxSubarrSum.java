public class MaxSubarrSum {

    public static void MaxSum(int arr[])
    {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int curr1=i;
            for(int j=i;j<arr.length;j++)
            {
                int curr2=j;
                for(int k=curr1;k<=curr2;k++)
                {
                    sum+=arr[k];
                }
                if(max<sum)
                {
                    max=sum;
                }
            }
        }
        System.out.println(max);

    }
    public static void main(String[]args)
    {
        int arr[]={2,4,6};
        MaxSum(arr);
    }
}
