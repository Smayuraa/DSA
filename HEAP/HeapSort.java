public class HeapSort {

    //heapify
    public static void heapify(int arr[],int size,int i)
    {
        int left=2*i+1;
        int right=2*i+2;
        int maxIdx=i;

        //left
        if(left<size&&arr[left]>arr[maxIdx])
        {
            maxIdx=left;
        }
        //right
        if(right<size&&arr[right]>arr[maxIdx])
        {
            maxIdx=right;
        }
        if(maxIdx!=i)
        {
            //swap
            int temp=arr[i];
            arr[i]=arr[maxIdx];
            arr[maxIdx]=temp;
            heapify(arr, size, maxIdx);
        }
    }
    //heapsort
    public static void heapsortFun(int arr[])
    {
        int n=arr.length;
        for(int i=n/2;i>=0;i--)
        {
            heapify(arr, n, i);
        }
        for(int i=n-1;i>0;i--)
        {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr, i, 0);
        }
    }

    public static void main(String[]args)
    {
        int arr[]={1,2,4,5,3};
        int size=arr.length;
        heapsortFun(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    
}