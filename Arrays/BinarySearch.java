public class BinarySearch {

    public static int FindKey(int arr[])
    {
        int key=10,left,right;
        left=0;
        right=arr.length-1;
        for(int i=0;i<arr.length;i++)
        {
         int mid=(left+right)/2;
         if(arr[mid]==key)
         {
          return mid;
         }
         else if(arr[mid]<key)
         {
            left=mid+1;
         }
         else{
            right=mid-1;
         }
        }
        return -1;
    }
    public static void main(String[]args)
    {
        int arr[]={2,3,4,5,10,56};
      int ans=FindKey(arr);
       if(ans==-1)
       {
        System.out.println("not found key");
       }
       else{
        System.out.println("found key");
       }
    }
}
