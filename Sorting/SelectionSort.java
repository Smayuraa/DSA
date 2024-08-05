package Sorting;

public class SelectionSort {
    public static void Sorting(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[i])
                {
                    //swapping
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }

        }
    }
    public static void PrintArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[]args)
    {
        int arr[]={4,3,8,1,0,5};
        Sorting(arr);
        PrintArr(arr);

    }
}
