public class LinearSearch {

    public static int find(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args)
    {
        int arr[]={2,3,4,5,1,11,12};
        int key=1;
        int ans=find(arr,key);
        if(ans==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("found key");
        }

    }
}
//tc-o(n)
