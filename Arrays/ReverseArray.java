public class ReverseArray {

    public static void reverse(int arr[])
    {
        int left=0,right=arr.length-1;
        while(left<right)
        {
            int temp=arr[right];
            arr[right]=arr[left];
            arr[left]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[]args)
    {
        int arr[]={10,20,30,40};
      reverse(arr);
      for(int i=0;i<arr.length;i++)
      {
        System.out.println(arr[i]);
      }
    }
}
